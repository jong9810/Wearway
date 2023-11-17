import React, {useEffect, useState} from "react";
import axios from 'axios';

import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import styled from "styled-components";
// Pages
import MainPage from './component/page/MainPage';

const MainTitleText = styled.p`
    font-size: 24px;
    font-weight: bold;
    text-align: center;
`;

function App(props) {
    const [hello, setHello] = useState('')
    useEffect(() => {
        axios.get('/api/hello').then(response => setHello(response.data)).catch(error => console.log(error))
    }, []);
  /*return (
      <BrowserRouter>
        <MainTitleText>Wearway</MainTitleText>
        <Routes>
          <Route index element={<MainPage />} />
        </Routes>
      </BrowserRouter>
  );*/
    return (
        <div>백엔드에서 가져온 데이터입니다 : {hello}</div>
    )
}

export default App;