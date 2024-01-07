import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './LoginPage.scss';

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
    <div class="box-container">
      <form onSubmit={handleSubmit}>
        <div class="logo">
          <img src='/img/logo.png' alt="대체 텍스트" />
        </div>
        <div class="login-cell">
          <input type="text" placeholder="아이디" value={username} onChange={(e) => setUsername(e.target.value)} />
        </div>
        <div class="login-cell">
          <input type="password" placeholder="비밀번호" value={password} onChange={(e) => setPassword(e.target.value)} />
        </div>
        <div class="checkbox-cell">
          <input type="checkbox"></input><label>로그인 상태 유지</label>
        </div>
        <div class="login-btn-cell">
          <button>Login</button>
        </div>
        <div class="add-ons">
          <ul class="menu">
            <li>비밀번호 찾기</li>
            <li>아이디 찾기</li>
            <li>회원가입</li>
          </ul>
        </div>
      </form>
    </div>
  );
}

export default LoginPage;
