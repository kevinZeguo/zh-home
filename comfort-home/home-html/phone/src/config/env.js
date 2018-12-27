/**
 * 配置开发、测试、生产环境
 * 
 * baseUrl: 域名地址
 * openUrl: 登录接口
 * imgUrl: 图片所在域名地址
 * 
 */
let baseUrl = '';
let routerMode = 'hash';
let imgUrl = '';

if (process.env.NODE_ENV == 'dev') {
    baseUrl = 'http://192.168.1.132:8704/';
    imgUrl = baseUrl + 'file/getFileThumb?fileName=';
} else if (process.env.NODE_ENV == 'prod') {
    baseUrl = 'https://portal.tuspark.com/';
    imgUrl = baseUrl + 'file/getFileThumb?fileName=';
}

export {
    baseUrl,
    imgUrl
}