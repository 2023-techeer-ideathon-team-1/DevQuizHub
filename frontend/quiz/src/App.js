import styled from "styled-components";
import Quiz from "./components/quiz";
import Header from "./components/header";
import Catelog from "./components/catelog";

function App() {
  return (
    <>
      <Header />
      <SideBar>
        <Catelog />
      </SideBar>
      <Body>
        <Quiz />
      </Body>
    </>
  );
}

export default App;

const SideBar = styled.div`
  float: left;
  width: 20%;
  height: 100vh;
`;

const Body = styled.div`
  float: right;
  width: 80%;
  height: 100vh;
`;
