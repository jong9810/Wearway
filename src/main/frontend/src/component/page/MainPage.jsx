<<<<<<< HEAD
import React, {useEffect, useState} from 'react';
import { useNavigate } from 'react-router-dom';
import styled from 'styled-components';
import ItemButton from "../ui/ItemButton";
import axios from "axios";

const Wrapper = styled.div`
    padding: 16px;
    width: calc(100% - 32px);
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
`;

const Container = styled.div`
    width: 100%;
    max-width: 720px;

    :not(:last-child) {
        margin-bottom: 16px;
    }
`;

function MainPage(props) {
    const navigate = useNavigate();
    const [hello, setHello] = useState('')
    useEffect(() => {
        axios.get('/api/main').then(response => setHello(response.data)).catch(error => console.log(error))
    }, []);
=======
import React from 'react';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
import styled from 'styled-components';
>>>>>>> c470da368059754216f8474a4e15eefd34a803a9

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