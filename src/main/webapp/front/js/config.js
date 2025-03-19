
var projectName = '大连环保公益网';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '环保社团',
	url: './pages/huanbaoshetuan/list.html'
}, 
{
	name: '兑换商城',
	url: './pages/duihuanshangcheng/list.html'
}, 
{
	name: '环保活动',
	url: './pages/huanbaohuodong/list.html'
}, 
{
	name: '环保众筹',
	url: './pages/huanbaozhongchou/list.html'
}, 

{
	name: '科普资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmmp65k/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","环保币"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","修改","删除","审核","新增","查看评论"],"menu":"环保社团","menuJump":"列表","tableName":"huanbaoshetuan"}],"menu":"环保社团管理"},{"child":[{"buttons":["查看","修改","删除","环保币入账","环保币扣减"],"menu":"用户环保币","menuJump":"列表","tableName":"yonghuhuanbaobi"}],"menu":"用户环保币管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"环保币入账","menuJump":"列表","tableName":"huanbaobiruzhang"}],"menu":"环保币入账管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"环保币扣减","menuJump":"列表","tableName":"huanbaobikoujian"}],"menu":"环保币扣减管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"兑换商城","menuJump":"列表","tableName":"duihuanshangcheng"}],"menu":"兑换商城管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"商品兑换","menuJump":"列表","tableName":"shangpinduihuan"}],"menu":"商品兑换管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"加入环保社团","menuJump":"列表","tableName":"jiaruhuanbaoshetuan"}],"menu":"加入环保社团管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"环保分类","menuJump":"列表","tableName":"huanbaofenlei"}],"menu":"环保分类管理"},{"child":[{"buttons":["查看","修改","删除","审核","查看评论","新增"],"menu":"环保活动","menuJump":"列表","tableName":"huanbaohuodong"}],"menu":"环保活动管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看","修改","删除","审核","查看评论","新增"],"menu":"环保众筹","menuJump":"列表","tableName":"huanbaozhongchou"}],"menu":"环保众筹管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"众筹支持","menuJump":"列表","tableName":"zhongchouzhichi"}],"menu":"众筹支持管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科普资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入"],"menu":"环保社团列表","menuJump":"列表","tableName":"huanbaoshetuan"}],"menu":"环保社团模块"},{"child":[{"buttons":["查看","兑换"],"menu":"兑换商城列表","menuJump":"列表","tableName":"duihuanshangcheng"}],"menu":"兑换商城模块"},{"child":[{"buttons":["查看","报名"],"menu":"环保活动列表","menuJump":"列表","tableName":"huanbaohuodong"}],"menu":"环保活动模块"},{"child":[{"buttons":["查看","支持"],"menu":"环保众筹列表","menuJump":"列表","tableName":"huanbaozhongchou"}],"menu":"环保众筹模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"用户环保币","menuJump":"列表","tableName":"yonghuhuanbaobi"}],"menu":"用户环保币管理"},{"child":[{"buttons":["查看"],"menu":"环保币入账","menuJump":"列表","tableName":"huanbaobiruzhang"}],"menu":"环保币入账管理"},{"child":[{"buttons":["查看"],"menu":"环保币扣减","menuJump":"列表","tableName":"huanbaobikoujian"}],"menu":"环保币扣减管理"},{"child":[{"buttons":["查看","删除"],"menu":"商品兑换","menuJump":"列表","tableName":"shangpinduihuan"}],"menu":"商品兑换管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"加入环保社团","menuJump":"列表","tableName":"jiaruhuanbaoshetuan"}],"menu":"加入环保社团管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看","修改","删除","支付"],"menu":"众筹支持","menuJump":"列表","tableName":"zhongchouzhichi"}],"menu":"众筹支持管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入"],"menu":"环保社团列表","menuJump":"列表","tableName":"huanbaoshetuan"}],"menu":"环保社团模块"},{"child":[{"buttons":["查看","兑换"],"menu":"兑换商城列表","menuJump":"列表","tableName":"duihuanshangcheng"}],"menu":"兑换商城模块"},{"child":[{"buttons":["查看","报名"],"menu":"环保活动列表","menuJump":"列表","tableName":"huanbaohuodong"}],"menu":"环保活动模块"},{"child":[{"buttons":["查看","支持"],"menu":"环保众筹列表","menuJump":"列表","tableName":"huanbaozhongchou"}],"menu":"环保众筹模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"加入环保社团","menuJump":"列表","tableName":"jiaruhuanbaoshetuan"}],"menu":"加入环保社团管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"环保活动","menuJump":"列表","tableName":"huanbaohuodong"}],"menu":"环保活动管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"环保众筹","menuJump":"列表","tableName":"huanbaozhongchou"}],"menu":"环保众筹管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"众筹支持","menuJump":"列表","tableName":"zhongchouzhichi"}],"menu":"众筹支持管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入"],"menu":"环保社团列表","menuJump":"列表","tableName":"huanbaoshetuan"}],"menu":"环保社团模块"},{"child":[{"buttons":["查看","兑换"],"menu":"兑换商城列表","menuJump":"列表","tableName":"duihuanshangcheng"}],"menu":"兑换商城模块"},{"child":[{"buttons":["查看","报名"],"menu":"环保活动列表","menuJump":"列表","tableName":"huanbaohuodong"}],"menu":"环保活动模块"},{"child":[{"buttons":["查看","支持"],"menu":"环保众筹列表","menuJump":"列表","tableName":"huanbaozhongchou"}],"menu":"环保众筹模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"环保社团","tableName":"huanbaoshetuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
