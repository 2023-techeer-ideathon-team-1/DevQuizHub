import styled from "styled-components";
import SearchBar from "./search";
import CircleButton from "./cir_btn";

function Header() {
  return (
    <Container>
      <h1>DevQuizHub</h1>
      <SearchBar /> <CircleButton />
    </Container>
  );
}

export default Header;

const Container = styled.div`
  display: flex;
`;
