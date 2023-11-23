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
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link,
  useNavigate,
} from "react-router-dom";
import { useState } from "react";

import "./App.css";
import Header from "./components/Header/Header";
import Home from "./pages/Home/Home";
import Cart from "./pages/Cart/Cart";
import CheckOut from "./pages/CheckOut/CheckOut";
import Payment from "./pages/Payment/Payment";
import PlaceOrder from "./pages/PlaceOrder/PlaceOrder";

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
      <br />
      <br />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/cart" element={<Cart />} />
        <Route path="/check" element={<CheckOut />} />
        <Route path="/check-payment" element={<Payment />} />
        <Route path="/check-place" element={<PlaceOrder />} />
      </Routes>
      <br />
      {/* <Button variant="success">Success</Button> */}
      <br />
    </div>
  );
}

export default App;
