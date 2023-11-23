import axios from "axios";
const API_ERL = "http://localhost:3000/api/orders";

const getOrders = () => {
  return axios.get(API_ERL);
};

const addOrder = (order) => {
  return axios.post(API_ERL, order);
};

const updateOrderStatus = (id, status) => {
  return axios.put(`${API_ERL}/${id}`, status);
};

export { getOrders, addOrder, updateOrderStatus };
