// vite.config.js
import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
    server: {
        port: 8080,
        proxy: {
            '/api': {
                target: 'http://localhost:9090/admin',
                changeOrigin: true,
                rewrite: (path) => path.replace(/^\/api/, '')
            },
        }
    },
    plugins: [vue()]
})
