import {
  Button,
  Table,
  Navbar,
  Container,
  NavDropdown,
  Nav,
  Form,
  Row,
  Col,
} from "react-bootstrap";
import { useState } from "react";
import "./App.css";
import Header from "./components/Header/Header";

function App() {
  const [bookList, setBookList] = useState([
    {
      title: "Harry Potter and the Sorcerer's stone",
      author: "J.K. Rowling",
      price: 200,
    },
    {
      title: "Jurassic Park",
      author: "Michael Crichton",
      price: 300,
    },
    {
      title: "The Lord of the Rings",
      author: "J. R. R. Tolkien",
      price: 400,
    },
    {
      title: "The Lord of the Rings",
      author: "J. R. R. Tolkien",
      price: 400,
    },
  ]);
  return (
    <div className="App">
      <Header />
      <br />
      <Button variant="success">Success</Button>
      <br />
      <Container>
        <Row>
          <Col xs={12} md={12} className="container">
            xs=12 md=8
          </Col>
          <Col
            xs={12}
            md={12}
            className="container"
            style={{ backgroundColor: "red" }}
          >
            xs=6 md=4
          </Col>
        </Row>
      </Container>
    </div>
  );
}

export default App;
