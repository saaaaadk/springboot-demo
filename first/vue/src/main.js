import {createApp} from 'vue'
import router from './router'
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import '@/assets/styles/border.css'
import '@/assets/styles/reset.css'
import SvgIcon from '@/icons'
import App from '@/App.vue'

const app = createApp(App)
SvgIcon(app);
app.use(store).use(router).use(ElementPlus).mount('#app')

