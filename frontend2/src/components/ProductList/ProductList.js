import React, { useState } from "react";
import { Container, Row, Col } from "react-bootstrap";
import ProductItem from "./Product/ProductItem";
import { useSelector } from "react-redux";

export default function ProductList() {
  const product = useSelector((state) => state.productList);
  console.log(product);
  return (
    <>
      <Container>
        <Row>
          {product.map((item) => {
            return (
              <Col xs={12} md={2}>
                <ProductItem {...item} />
              </Col>
            );
          })}
        </Row>
      </Container>
    </>
  );
}
