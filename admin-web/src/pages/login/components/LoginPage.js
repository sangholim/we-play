import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './LoginPage.css';  

function LoginPage() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    // 로그인 검증 로직 (여기서는 단순화를 위해 생략)
    // 예: if (username === 'user' && password === 'password') { ... }
    navigate('/home'); // 로그인 성공 시 홈페이지로 리디렉션
  };

  return (
    <div class="center-block">
      <form onSubmit={handleSubmit}>
        <div>
          <label>Username:</label>
          <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
        </div>
        <div>
          <label>Password:</label>
          <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
        </div>
        <button type="submit">Login</button>
      </form>
    </div>
  );
}

export default LoginPage;
