import { createStore } from 'vuex'
import user from './modules/user'
import actions from './actions'
import mutations from './mutations'


const store = createStore({
    modules: {
        user
    },
    actions,
    mutations
})

export default store