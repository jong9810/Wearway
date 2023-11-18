<<<<<<< HEAD
import React, {useEffect, useState} from "react";
import axios from 'axios';
import MainPage from "./component/page/MainPage"

import {BrowserRouter, Routes, Route} from "react-router-dom";

import styled from "styled-components";
// Pages
=======
import React, { Component } from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Header from './component/ui/Header';
>>>>>>> c470da368059754216f8474a4e15eefd34a803a9
import MainPage from './component/page/MainPage';
import Product from './component/ui/Product';
import NotFoundPage from './component/page/NotFoundPage';


<<<<<<< HEAD
function App(props) {

  /*return (
      <BrowserRouter>
        <MainTitleText>Wearway</MainTitleText>
        <Routes>
          <Route index element={<MainPage />} />
        </Routes>
      </BrowserRouter>
  );*/
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/main" element={<MainPage />}></Route>
            </Routes>
        </BrowserRouter>
    )
}
=======
const App = () => {
    return (
        <div className='App'>
            <BrowserRouter>
                <Header />
                <Routes>
                    <Route path="/" element={<MainPage />}></Route>
                    <Route path="/product/:productId" element={<Product />}></Route>
                    {/* 엘리먼트의 상단에 위치하는 라우트들의 규칙을 모두 확인하고, 일치하는 라우트가 없다면 이 라우트가 화면에 나타나게 됩니다. */}
                    <Route path="*" element={<NotFoundPage />}></Route>
                </Routes>
            </BrowserRouter>
        </div>
    );
};
>>>>>>> c470da368059754216f8474a4e15eefd34a803a9

export default App;