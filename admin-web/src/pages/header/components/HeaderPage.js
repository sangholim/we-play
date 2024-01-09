import React from 'react';
import './HeaderPage.scss';

function HeaderPage() {
  return (
    
    <div class="header">
        <div className='logo'>
          <img src='/img/logo.png' alt="대체 텍스트" />
        </div>
        <div class="login-info">
          <div class="user-name">seungheon lee</div>
          <button class="logout-button">Logout</button>
        </div>
    </div>

  );
}

export default HeaderPage;