import React from 'react';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
import styled from 'styled-components';

function Main(props) {
    return (
        <>
            <h3>MainPage</h3>
            <ul>
                <Link to="/Product/1"><li>1번상품</li></Link>
                <Link to="/Product/2"><li>2번상품</li></Link>
            </ul>
        </>
    );
}

export default Main;