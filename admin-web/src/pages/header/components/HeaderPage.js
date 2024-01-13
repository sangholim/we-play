import React from 'react';
import styles from './HeaderPage.module.scss';

function HeaderPage() {
  return (
    
    <div class={styles.header}>
        <div className={styles.logo}>
          <img src='/img/logo.png' alt="대체 텍스트" />
        </div>
        <div class={styles.loginInfo}>
          <div class={styles.userName}>seungheon lee</div>
          <button class={styles.logoutButton}>Logout</button>
        </div>
    </div>

  );
}

export default HeaderPage;