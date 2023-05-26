import React, { useState } from "react";
import styled from "styled-components";

const CircleButton = () => {
  const [selectedButton, setSelectedButton] = useState(null);

  const handleClick = (button) => {
    setSelectedButton(button);
    // 버튼 클릭 시 수행할 로직을 추가하세요
    console.log("Selected button:", button);
  };

  return (
    <Container>
      <button
        className={selectedButton === "button1" ? "selected" : ""}
        onClick={() => handleClick("button1")}
      >
        퀴즈 추가
      </button>
      <button
        className={selectedButton === "button2" ? "selected" : ""}
        onClick={() => handleClick("button2")}
      >
        마이페이지
      </button>
    </Container>
  );
};

export default CircleButton;

const Container = styled.div`
  display: flex;
  justify-content: center; // 가로
  align-items: center; // 세로
  margin-left: 200px;
`;
