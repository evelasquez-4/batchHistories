--
-- PostgreSQL database dump
--

-- Dumped from database version 11.22
-- Dumped by pg_dump version 15.3

-- Started on 2024-07-21 16:34:52 EDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE dbbatch;
--
-- TOC entry 3274 (class 1262 OID 93277)
-- Name: dbbatch; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE dbbatch WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'en_US.UTF-8';


ALTER DATABASE dbbatch OWNER TO postgres;

\connect dbbatch

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3258 (class 0 OID 93306)
-- Dependencies: 203
-- Data for Name: address; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.address (id, text, county, state, zip_code, is_verify, is_house) VALUES (1, '6122 Bardu Avenue', 'West Springfield', 'VA', 22152, true, true);
INSERT INTO public.address (id, text, county, state, zip_code, is_verify, is_house) VALUES (2, '4700 Perch Place', 'Alexandria', 'VA', 22309, true, true);
INSERT INTO public.address (id, text, county, state, zip_code, is_verify, is_house) VALUES (3, '3307 Battersea Lane', 'Alexandria', 'VA', 22309, true, true);
INSERT INTO public.address (id, text, county, state, zip_code, is_verify, is_house) VALUES (4, '8324 Blowing Rock Road', 'Alexandria', 'VA', 22309, true, true);
INSERT INTO public.address (id, text, county, state, zip_code, is_verify, is_house) VALUES (5, '7905 Hilltop Village Center Drive', 'Alexandria', 'VA', 22315, true, false);


--
-- TOC entry 3254 (class 0 OID 93288)
-- Dependencies: 199
-- Data for Name: batch; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.batch (id, cant_orders, date, multi_store, shopper_id) VALUES (1, 2, '2024-07-02', false, 1);


--
-- TOC entry 3260 (class 0 OID 93364)
-- Dependencies: 205
-- Data for Name: customer; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.customer (id, name, is_good_tipper, is_suspicious, register_date) VALUES (1, 'Danielle A', true, false, '2024-07-02');
INSERT INTO public.customer (id, name, is_good_tipper, is_suspicious, register_date) VALUES (2, 'Hilda J M', false, false, '2024-07-02');


--
-- TOC entry 3264 (class 0 OID 93534)
-- Dependencies: 209
-- Data for Name: image; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.image (id, type, path, order_id) VALUES (1, 'JPG', 'src/resources/imgs/img1.jpg', 1);
INSERT INTO public.image (id, type, path, order_id) VALUES (2, 'JPG', 'src/resources/imgs/img2.jpg', 1);


--
-- TOC entry 3262 (class 0 OID 93378)
-- Dependencies: 207
-- Data for Name: order; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."order" (id, total_items, date, is_gift, note, tip, customer_id, store_id, batch_id, shopper_notes, due_date, number_order, address_id) VALUES (1, 13, '2024-07-02', false, NULL, 3.43000000000000016, 2, 1, 1, NULL, '2024-07-02 21:43:32.235054-04', 4, 1);
INSERT INTO public."order" (id, total_items, date, is_gift, note, tip, customer_id, store_id, batch_id, shopper_notes, due_date, number_order, address_id) VALUES (2, 26, '2024-07-02', false, 'Please leave on porch, thank you', 43.25, 1, 1, 1, NULL, '2024-07-02 21:45:48.302764-04', 79, 2);


--
-- TOC entry 3266 (class 0 OID 101744)
-- Dependencies: 211
-- Data for Name: prueba; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.prueba (id, cadena, numero) VALUES (1, 'prueba 1', 1);
INSERT INTO public.prueba (id, cadena, numero) VALUES (2, 'prueba 2', 2);
INSERT INTO public.prueba (id, cadena, numero) VALUES (3, 'prueba 3', 3);


--
-- TOC entry 3268 (class 0 OID 101772)
-- Dependencies: 213
-- Data for Name: prueba2; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.prueba2 (id, cadena, p_id) VALUES (1, 'a', 1);
INSERT INTO public.prueba2 (id, cadena, p_id) VALUES (3, 'b', 2);


--
-- TOC entry 3252 (class 0 OID 93280)
-- Dependencies: 197
-- Data for Name: shopper; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.shopper (id, code, name, phone_number, sex) VALUES (1, 'EV1234', 'ELMER VELASQUEZ', 5719770973, true);
INSERT INTO public.shopper (id, code, name, phone_number, sex) VALUES (2, 'sh1', 'shopper 1', 1234567, true);


--
-- TOC entry 3256 (class 0 OID 93298)
-- Dependencies: 201
-- Data for Name: store; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.store (id, name, code, address_id) VALUES (1, 'Wegmans', 'WG', 5);


--
-- TOC entry 3285 (class 0 OID 0)
-- Dependencies: 210
-- Name: Prueba_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Prueba_id_seq"', 3, true);


--
-- TOC entry 3286 (class 0 OID 0)
-- Dependencies: 202
-- Name: address_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.address_id_seq', 5, true);


--
-- TOC entry 3287 (class 0 OID 0)
-- Dependencies: 198
-- Name: batch_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.batch_id_seq', 1, true);


--
-- TOC entry 3288 (class 0 OID 0)
-- Dependencies: 204
-- Name: customer_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.customer_id_seq', 2, true);


--
-- TOC entry 3289 (class 0 OID 0)
-- Dependencies: 208
-- Name: image_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.image_id_seq', 2, true);


--
-- TOC entry 3290 (class 0 OID 0)
-- Dependencies: 206
-- Name: order_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.order_id_seq', 2, true);


--
-- TOC entry 3291 (class 0 OID 0)
-- Dependencies: 212
-- Name: prueba2_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.prueba2_id_seq', 3, true);


--
-- TOC entry 3292 (class 0 OID 0)
-- Dependencies: 196
-- Name: shopper_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.shopper_id_seq', 2, true);


--
-- TOC entry 3293 (class 0 OID 0)
-- Dependencies: 200
-- Name: store_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.store_id_seq', 1, true);


-- Completed on 2024-07-21 16:34:52 EDT

--
-- PostgreSQL database dump complete
--

