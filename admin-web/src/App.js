import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import LoginPage from './pages/login/components/LoginPage';
import HomePage from './pages/home/components/HomePage';
import HeaderPage from './pages/header/components/HeaderPage';
import SidebarPage from './pages/sidebar/components/SidebarPage';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<LoginPage />} />
        <Route path="/home" element={<HomePage />} />
        <Route path="/header" element={<HeaderPage/>} />
        <Route path="/sidebar" element={<SidebarPage/>} />
      </Routes>
    </Router>
  );
}

export default App;