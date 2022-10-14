import { createApp } from 'vue'
import App from './App.vue'
import './assets/main.css'
import router from './router';
import store from './store/index.js'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

let app = createApp(App);
app.use(router).
    use(store).
    use(ElementPlus)
app.mount('#app')