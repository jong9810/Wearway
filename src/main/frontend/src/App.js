import React, {useEffect, useState} from "react";
import axios from 'axios';
import MainPage from "./component/page/MainPage"

import {BrowserRouter, Routes, Route} from "react-router-dom";

import styled from "styled-components";
// Pages
import MainPage from './component/page/MainPage';

const MainTitleText = styled.p`
    font-size: 24px;
    font-weight: bold;
    text-align: center;
`;

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

export default App;