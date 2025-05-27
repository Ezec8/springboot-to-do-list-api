import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

export default defineConfig({
  plugins: [react()],
  server: {
    port: 5173, // default Vite port
    proxy: {
      '/api': 'http://localhost:8080' // proxies /api calls to Spring Boot backend
    }
  }
})
