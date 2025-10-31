import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import './index.css'
import App from './App.jsx'
import TodoList from './features/todos-page/TodoList.jsx'
import TodosForm from './features/todos-page/TodosForm.jsx'


const appRoutes = createBrowserRouter([{
    path: '/',
    element: <App />,
    children: [
            {
                path: '/',
                element: <TodoList />,
            },
            {
                path: '/add-todo',
                element: <TodosForm />,
            }
        
    ]
}])

createRoot(document.getElementById('root')).render(
    <RouterProvider router={appRoutes}>
    <App />
    </RouterProvider>

)
