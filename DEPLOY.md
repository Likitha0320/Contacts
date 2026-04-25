# Deployment (Render)

This repo includes a `render.yaml` blueprint for one-click full-stack deployment.

## Steps

1. Open Render dashboard and choose **New +** -> **Blueprint**.
2. Connect this GitHub repo: `abhikongara36-cloud/Contact`.
3. Render reads `render.yaml` and creates two services:
   - `contact-backend` (Spring Boot)
   - `contact-frontend` (React static)
4. After first deploy, update environment variables with your real service URLs:
   - Backend `app.cors.allowed-origin` = your frontend URL
   - Frontend `REACT_APP_API_BASE_URL` = your backend URL
5. Trigger a redeploy for both services.

## Local defaults

- Frontend uses `REACT_APP_API_BASE_URL` and falls back to `http://localhost:8080`.
- Backend CORS uses `app.cors.allowed-origin` and defaults to `http://localhost:3000`.
