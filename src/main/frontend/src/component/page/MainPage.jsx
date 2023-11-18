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

    return (
        <Wrapper>
            <Container>
                <ItemButton img src="../img/ItemImg.png" alt=""></ItemButton>
            </Container>
        </Wrapper>
    );
}

export default MainPage;