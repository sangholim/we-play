import React from 'react';
import styles from "./SidebarPage.module.scss";

function SidebarPage() {

  const handleClick = (event) => {
    console.log("버튼 클릭됨");
    event.target.parentElement.querySelector('[class*="dropDownContainer"]').classList.toggle(styles.active);
  };

  return (

    <div class={styles.sidebar}>
      <div className={styles.logo}>
        <img src='/img/logo-mini.png' alt="대체 텍스트" />
      </div>
      <div class={styles.dropDownBtn}>
        <a href="#" onClick={handleClick}>그룹관리</a>
        <div class={styles.dropDownContainer}>
          <a href="#">그룹명 1</a>
          <a href="#">그룹명 2</a>
        </div>
      </div>
      <div class={styles.dropDownBtn}>
        <a href="#" onClick={handleClick}>계정관리</a>
        <div class={styles.dropDownContainer}>
          <a href="#">계정 1</a>
          <a href="#">계정 2</a>
        </div>
      </div>
    </div>

  );
}

export default SidebarPage;