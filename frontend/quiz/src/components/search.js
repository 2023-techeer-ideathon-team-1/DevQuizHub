import React, { useState } from "react";
import { FaSearch } from "react-icons/fa";
import styled from "styled-components";

const SearchBar = () => {
  const [searchTerm, setSearchTerm] = useState("");

  const handleChange = (e) => {
    setSearchTerm(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("Submitted search term:", searchTerm);
  };

  return (
    <Form onSubmit={handleSubmit}>
      <input
        type="text"
        placeholder="검색어를 입력하세요..."
        value={searchTerm}
        onChange={handleChange}
      />
      <button type="submit">
        <FaSearch />
      </button>
    </Form>
  );
};

export default SearchBar;

const Form = styled.form`
  display: flex;
  margin-left: 100px;
  justify-content: center; // 가로
  align-items: center; // 세로
`;
