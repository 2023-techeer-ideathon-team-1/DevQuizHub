import { useState } from "react";
import { Container, Row, Col } from "react-bootstrap";

function Quiz() {
  const data = [{ sho: "hi" }, { sho: "hel" }, { sho: "hiii" }];
  let [quiz, setQuiz] = useState(data);
  return (
    <Container>
      <Row>
        {quiz.map(function (a, i) {
          return (
            <Col>
              <h4>{a.sho}</h4>
              <h4>{a.sho}</h4>
            </Col>
          );
        })}
      </Row>
    </Container>
  );
}

export default Quiz;
