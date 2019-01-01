import axios from 'axios';
import { openUrl } from '../config/env';

import req from '../config/axios';

// 产品列表
export const productList = param => {
	return req.get('home/product.ajax', param);
};

// 获取报价
export const productQuote = param => {
	return req.get('home/quote.ajax', param);
};
