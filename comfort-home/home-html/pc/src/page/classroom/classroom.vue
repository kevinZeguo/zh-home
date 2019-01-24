<template>
    <div class="class-room">
        <ul class="c-nav">
            <li class="c-nav-1" @click="changeNav(1)">温度课堂</li>
            <li class="c-nav-2" @click="changeNav(2)">空气课堂</li>
            <li class="c-nav-3" @click="changeNav(3)">水处理课堂</li>
            <li class="c-nav-4" @click="changeNav(4)">热水课堂</li>
            <li class="c-nav-5" @click="changeNav(5)">厨房课堂</li>
            <li class="c-nav-6" @click="changeNav(6)">智能课堂</li>
        </ul>

        <div class="c-container" v-if="navIndex == 1">
            <div class="c-col-l">
                <div class="c-sidebar">
                    <div class="hd">温度课堂</div>
                    <ul class="bd">
                        <li :class="{active: tabIndex == 1}" @click="changeTab(1)">地暖小知识</li>
                        <li :class="{active: tabIndex == 2}" @click="changeTab(2)">暖气片小知识</li>
                        <li :class="{active: tabIndex == 3}" @click="changeTab(3)">老房装暖气你需要知道的事</li>
                    </ul>
                </div>
            </div>
            <div class="c-col-r">
                <div class="c-con" v-if="tabIndex == 1">
                    <div class="c-tit">地暖小知识</div>
                    <div class="c-names"><span>地暖的定义</span></div>
                    <div class="c-prop">地暖是地板辐射采暖的简称，是以整个地面为散热器，通过地板辐射层中的热媒，均匀加热整个地面，利用地面自身的蓄热和热量向上辐射的规律由下至上进行传导，来达到取暖的目的。</div>
                    <div class="c-prop"><img src="../../assets/img/pic-700x395-1.jpg" /></div>
                    <div class="c-names"><span>地暖的特点</span></div>
                    <div class="c-prop">1.舒适健康：地暖的温度是自下而上的，给人以温足而头凉的舒适感，符合中医理论。<br />2.节能环保：在达到同样的室温效果，比传统采暖可以调低2-3度，有效节约能源，并且不会污染室内空气。<br />3.散热均匀稳定：地暖传热，热量散发均匀，加之混凝土有蓄能作用，即使间歇供暖也能保持室温稳定。<br />4.减少楼层噪音：中国楼板隔音效果极差，采用地暖增加了保温层，可降低噪音污染。</div>
                    <div class="c-names"><span>安装地暖流程</span></div>
                    <div class="c-prop">整平地面。地暖正式开始铺设之前，要先将室内的地面清理干净，保证地面的平整，排除地面的凹凸和杂物。确认壁挂炉以及分集水器的安装位置。<br /><br />1.安装温控线：在装分集水器的地方开槽，隐埋温控线，并将相关温控线放到其周围，以便连接。<br />2.安装主水管：地暖主水管必须使用热水管且管道需要能在60℃高温环境中长时间使用，可使用PE-X或者PB管，安装平直整齐。<br />3.铺设保温层：保温板铺设要平整，相互联接缝要紧密，整板放在四周，切割板放在中间，高差和缝隙不能超过标准范围。<br />4.铺设反射膜：反射膜铺设一定平整，遮盖严密，反射膜方格对称整洁，反射膜之间必需用透明胶带或铝箔胶带粘贴。<br />5.铺设地暖管：地暖管应按设计图纸标定的管间距和走向敷设，安装间断或完毕时，敞口处应随时封堵。地暖切口应平整，断口面应垂直管轴线。<br />6.安装分集水器：将组装好的分集水器按照预先根据用户家中实际情况确定的位置和标高，平直、牢固的紧贴于墙壁，并用膨胀螺栓固定好。<br />7.管路水压测试：地暖管铺设好后，进行水压试验，先对管道进行水压冲洗、吹扫等，保证管道内无异物。然后从注水排气阀注入清水，试验压力为工作压力的1.5～2倍，但不小于0.6Mpa，稳压1小时内压力降不大于0.05Mpa，且不渗不漏为合格。<br />8.回填找平地面：回填细石混凝土，保持全屋水平线必须在一个高度。铺设混凝土时，门口、过道、地漏必须做好记号，防止后期施工被破坏。<br />9.安装壁挂炉：根据壁挂炉尺寸，及安装前预留尺寸，烟道位置，校准正确位置后再安装壁挂炉，壁挂炉底下接口采用软管连接。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con" v-if="tabIndex == 2">
                    <div class="c-tit">暖气片小知识</div>
                    <div class="c-names"><span>暖气片的定义</span></div>
                    <div class="c-prop">暖气片是一种采暖为主的采暖设备。主要在冬天寒冷的北方地区使用，具有保暖的作用，以前多使用铸铁暖气片，现在已经发展出了更多材质的暖气片。 </div>
                    <div class="c-prop">铸铁暖气片已经逐步退出了市场舞台，钢制暖气片、铜铝复合散热器、铝制暖气片等新型暖气片无论从材质上还是制作工艺上都优于铸铁散热器，成为市场上最主流的暖气片。</div>
                    <div class="c-prop"><img src="../../assets/img/pic-700x293-1.jpg" /></div>
                    <div class="c-names"><span>暖气片安装事项</span></div>
                    <div class="c-prop">1、暖气片在安装前确认暖气片包装的完整,放置时采用相应的防震、防碰措施，不能以任何方式拖拉暖气片，暖气片应存放在干燥和防雨的安全地方。<br />2、现场要清理干净，供热系统的阀门、干管、支管及管道的支、吊架均已安装并按设计要求管道冲洗试压完毕。 3、暖气片外接口螺纹应符合JG/T6-1999的要求，连接暖气片的支管螺纹应完整，如有断丝或缺丝则不得大于螺纹全扣的10%，并至少年宫扣以上的完整螺纹。<br />4、安装暖气片处的内墙已处理完毕。<br />5、钢制暖气片、铝制暖气片、铜铝复合暖气片、铸铁暖气片等本体试验压力如设计无要求时应按设计选用的工作压力的1.5倍进行，但钢制板式暖气片本体最大试验压力不应超过1.3MPa并不小于1.3MPa.试压2至3分钟不渗漏为合格。<br /> 6、暖气片安装步骤：先安进水阀和回水阀，固定挂件用水平尺测量暖气片的位置，将暖气片平稳放置，将阀门连接件与进出水口阀门连接在一起，使用水平尺测量暖气片是否平直，管路安装是否符合要求。使用管钳加固拧紧连接件。试压：关闭主管连接阀门，关闭暖气片的进回水阀，试验压力应为工作压力的1.5倍进行试压2至3分钟不渗漏为合格。</div>
                    <div class="c-names"><span>散热器如何保养？</span></div>
                    <div class="c-prop">散热器在下一个供暖季节来临之前，一直处于闲置状态。因此，在供暖之前对散热器进行清洁与保护是十分必要的。而正确保养散热器也是必不可少的。<br />新的采暖季节到来之前，应对散热器上连接的放气阀、丝堵及管路上的管件进行检查，（受热胀冷缩的影响）螺纹连接处如有松动现象应拧紧，以免供暖后漏水。还有，清洁散热器表面时，请使用软毛巾或毛刷，请勿使用任何种类的有机溶液，可使用日常的洗涤剂，如：洗洁灵，弱碱性肥皂水等。<br />弄清散热片材质，采暖适宜的保养方法。不同材质的散热片保养方式不一样，如钢制散热片一般要用满水保养的方法，而铝制的则不需要。<br />因此，当我们准备启用散热器供暖之前，如何做好清洁工作是非常重要的，而且马虎不得。毕竟想要舒服的过完整个冬天，散热器是大功臣一个。</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-648x370-1.jpg" /></div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con" v-if="tabIndex == 3">
                    <div class="c-tit">老房装暖气你需要知道的事</div>
                    <div class="c-prop">一到冬天，住在老房子的你，多多少少都会遇到过这些问题：<br />老房没有接入集中供暖接口？<br />供热站供暖老是烧不暖？<br />屋里暖气忽冷忽热？<br />家里有老人孩子，很多时候需要温度要求更高一些？</div>
                    <div class="c-prop"><img src="../../assets/img/pic-classroom-heating-1.jpg" /></div>
                    <div class="c-prop">也肯定很多次在若有若无的暖意中去试探暖气片温度，拨打物业电话反反复复去检查。其实，所有这些问题，非常容易解决，只需要简单几步，老房子就能装上新暖气，这个冬天就可以告别寒冷啦。</div>
                    <div class="c-prop">老房装暖气的步骤很简单，大概可以分为以下6步</div>
                    <div class="c-prop">1.定位打孔<br />专业设计师精准定位，并采用无尘打孔，地面铺设保护膜，不会对室内家具和装修产生影响。</div>
                    <div class="c-prop">2.铺设管路<br />• 照事先设计的安装位置来确定管路的线路，布管线路一般是在吊顶、踢脚线等隐蔽的地方，明管的铺设尽量不影响到室内的装修或占用太多的空间。</div>
                    <div class="c-prop">3.安装暖气片<br />• 安装暖气片在安装暖气片的过程中要将暖气片放置平稳，而且要使用水平尺进行测量，看是否安装平稳，然后把阀门连接件和进出水口阀门相连接，检查无误后，用管钳进行加固。</div>
                    <div class="c-prop">4.安装壁挂炉<br />• 壁挂炉的安装需要注意与明线和电气设备隔开，也不能将易燃易爆物品放在其周围，具体来说，壁挂炉与燃气表和燃气灶的距离应该超过750px。</div>
                    <div class="c-prop">5. 压力测试<br />• 验收施工人员在对管道进行冲压测试时,没有出现跑、冒、漏、滴等现象。一般测试3-5分钟无渗漏为合格。</div>
                    <div class="c-prop">6.验收使用<br />• 在您检查确认后便可以验收，等待暖冬的到来！</div>
                    <div class="c-prop">明装暖气有几个非常明显的优势：</div>
                    <div class="c-prop">1.安装快捷，一天即可完工<br />采暖热水兼顾明装的管路主要是简单铺设，无开挖，不回填，因而铺设周期很短，一天就可完成安装、调试，基本不影响家庭日常起居。</div>
                    <div class="c-prop">2.工艺美观，不影响室内装修<br />明装采暖管道走踢脚线、阴角线、吊顶或者窗帘、家具后面等隐蔽位置，横平竖直，无开挖无回填，完全不用担心会破坏原有的装修格局。</div>
                    <div class="c-prop">3.使用舒适，没有热风和扬尘服务周到<br />明装暖气属于水暖，比较温润，没有空调那样的热风干燥，不会吹起室内扬尘。人体感觉更舒适，使用方便，能自由调温，舒适性高，制热不干燥。明装暖气片采暖，室内温暖可控制在18-22度，独立控制每个房间的温度，控制采暖时间。原采用燃气热水器用户，一举双得，取暖同时解决全屋热水，专业节能。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con mt30">
                    <ul class="c-name-link">
                        <li><router-link to="/solution/1">查看温度解决方案</router-link></li>
                        <li><router-link to="/quotation">1分钟快速报价</router-link></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 2">
            <div class="c-col-l">
                <div class="c-sidebar">
                    <div class="hd">空气课堂</div>
                    <ul class="bd">
                        <li :class="{active: tabIndex == 1}" @click="changeTab(1)">有孩子的家庭需要什么样的新风系统</li>
                    </ul>
                </div>
            </div>
            <div class="c-col-r">
                <div class="c-con" v-if="tabIndex == 1">
                    <div class="c-tit">有孩子的家庭需要什么样的新风系统？</div>
                    <div class="c-prop">现在流行“舒适家居”的概念，怎样才称得上“舒适家居”？房间内需要有舒适的温湿度、还需要考虑居住的安静度及空气的洁净度。而空气的洁净度现在随着整个大气环境的变化最早引起了乐享生活者的关注。尤其是家里有孩子和老人的家庭。今天，让我们一起走进新风系统选购及安装使用的大课堂，选择一款最适合自己家居环境，尤其是可以保护孩子的新风产品。</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-classroom-air-1.jpg" /></div>
                    <div class="c-names"><span>为什么要安装新风系统？什么样的环境需要安装新风系统？</span></div>
                    <div class="c-prop">目前，市场上使用最多的是空气净化机，而与新风机相比，空气净化机有很多局限性，在使用过程中很多消费者反馈紧闭门窗使用，房间会出现缺氧现象，而且不能通风引入新鲜空气，不能够满足消费者对“舒适家居”环境的需求，而新风系统就能很好解决这个问题，可以说是集空气净化与通风于一体，同时有些品牌的新风系统还能帮助节省能耗。</div>
                    <div class="c-prop">那么除了想营造“舒适家居”环境的消费者需要安装新风系统，还有哪些家居环境需要注意空气质量问题？1）新装修房屋：新装修房屋室内有很多的有毒物质，容易影响人的身体健康，而且像甲醛这类的化学污染物质挥发周期有2~20年不等。2）家里有小孩的家庭：小孩子在长身体的阶段，体内脏器都没有发育完全，室内室外的空气污染都在影响着孩子的健康成长。3）户型不通透、异味较重房屋：如地下室、封闭的储物室、酒店客房、工厂车间等。这些地方的空气质量普遍较差，需要新鲜干净的空气。4）靠马路的房子或周边有污染源的房子：有噪音、灰尘、汽车尾气等污染物，或整体小区靠着有污染的地方或化工厂类的污染较重地方，开窗有味道，不开窗憋闷。5）其他特殊场所，如机房、宾馆、商场、写字楼、餐馆、银行、教室、幼儿园、医院病房等场所，对空气质量的要求也非常高，最好也使用新风系统。</div>
                    <div class="c-names"><span>全屋中央新风还是单房间壁挂新风？</span></div>
                    <div class="c-prop">确定了安装新风的必要性，那么就要考虑房间里面到底怎么安装新风系统，是全屋安装中央型新风还是单房间安装壁挂新风。全屋中央新风可以保证整套房间的空气品质，而单房间壁挂新风只能优化单个房间空气质量。</div>
                    <div class="c-prop">到底该如何选择？可以从以下两个方面考虑，首先从装修角度考虑，看是已装房还是新装房，一般如果是已装房可以选择单房间安装壁挂新风，这样不会破坏装修；如果是新装房可以直接安装全屋中央新风，保证整套房的空气品质，一劳永逸。另外，可以从安装新风系统的决心考虑，问问自己是否想要舒适洁净的家居空气环境，如果答案是肯定的，也可以直接选择安装全屋中央新风系统。明确了需求，那么就可以接下来选择合适的新风机型。</div>
                    <div class="c-names"><span>如何选择合适的新风产品？</span></div>
                    <div class="c-prop">选择新风机型也很讲究，现在市场上品牌众多，功能各异，有很多消费者都无从选择。但基本把握重心，坚持几个选购原则就行，可以从新风量、除菌率、噪音、能耗、空气新鲜度等方面来考虑。型号方面需要注意选择与房间所需新风量相匹配的机型，就像买空调也需要挑选相匹配的匹数一样。买新风机则需要关注新风量，新风量指的是单位小时内从室外引入室内的新鲜空气量，是衡量室内空气质量的重要指标。如果房间大，选择新风量较小机型，则不能够满足实际新风需求，将直接影响使用体验。因此，在选购时应该请专业人士帮忙挑选合适的机型。</div>
                    <div class="c-prop">功能方面看看是否可以满足无粉尘、无细菌、无缺氧、无噪音、省能耗这几点，简称“四无一省”。无粉尘——100倍空气净化。优质的洁净新风99.9%过滤PM2.5，确保“室内比室外洁净100倍”。无缺氧——100%新风。优质的洁净新风将室内脏空气100% 排出，源源不绝地引入新鲜空气。无细菌——杀灭细菌、杜绝传染病。优质的洁净新风通过静电除尘瞬间杀灭病菌，杜绝空气传播的疾病。无噪音——听不到丝毫噪音。新风系统噪音太大，会严重影响情绪，降低生活质量。优质的洁净新风机高风压远送风，安装位置可避开客厅、卧室等场所。省费用——新风热回收。在空调使用季节，开窗通风或风机通风，会加大空调能耗。优质的洁净新风机具备热回收功能，最高能回收排风中80% 的热能。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con mt30">
                    <ul class="c-name-link">
                        <li><router-link to="/solution/2">查看空气解决方案</router-link></li>
                        <li><router-link to="/quotation">1分钟快速报价</router-link></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 3">
            <div class="c-col-l">
                <div class="c-sidebar">
                    <div class="hd">水处理课堂</div>
                    <ul class="bd">
                        <li :class="{active: tabIndex == 1}" @click="changeTab(1)">净水产品如何选购</li>
                    </ul>
                </div>
            </div>
            <div class="c-col-r">
                <div class="c-con" v-if="tabIndex == 1">
                    <div class="c-tit">净水产品如何选购？净水机和软水机有什么区别？</div>
                    <div class="c-prop">水是生命之源，人体70%由水组成，当人体失去6%的水分时，就会出现口渴、发烧等情况。人如果不喝水，生命只能维持7天左右。所以，水的质量直接影响生命的质量，市面上检测水质的辅助工具有很多，比如用pH检测试纸检测PH值、用TDS水质测试笔测试溶解性总固体（TDS）、GH测试剂检测水的硬度、用余氯测试剂检测余氯成分等，根据实际水质情况选择不同的净水装备。</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-classroom-water-1.jpg" /></div>
                    <div class="c-names"><span>前置过滤器</span></div>
                    <div class="c-prop">家用净水的第一关是前置过滤器，建议新房装修或者老房改造时配置。前置过滤器可以过滤掉入户自来水中的泥沙、铁锈、大颗粒杂质，去除供水网二次污染，对家里的下游管道、净水器、热水器、洗衣机、龙头、花洒起到保护作用。</div>
                    <div class="c-names"><span>中央净水器</span></div>
                    <div class="c-prop">如果家中生活用水闻起来有异味，TDS值明显偏高，那么你家有必要安装净水机了。</div>
                    <div class="c-prop">净水机设备中的活性炭吸附、PP棉和高纯度KDF滤料能实现净水作用，净水机能够过滤掉自来水中的杂质、铁锈、细菌、病毒、胶体等，能有效的祛除水中的有害物质，提高生活用水的安全，并改善口感。</div>
                    <div class="c-prop">采用RO反渗透技术的纯水净水机过滤后的水还可以直接饮用。</div>
                    <div class="c-prop">使用净水机时需要注意定期更换滤芯，不同材质的滤芯使用寿命不同，避免因超期使用而产生二次污染。</div>
                    <div class="c-names"><span>软水机</span></div>
                    <div class="c-prop">硬水指的是含有较多的可溶性钙盐和镁盐的天然水，硬水中含盐量通常以硬度表示，硬度单位是度，1度相当于每升水中含10毫克的氧化钙。硬度在8以上者通常称为硬水。长期使用硬水，可能会出现水龙头堵塞、水垢引起热水器堵塞等以下危害。</div>
                    <div class="c-prop">当检测到水的硬度较高时，软水机需要派上用场。软水机的作用在于去除水中的钙、镁离子，达到硬水软化的效果。使用软水的直观感受是，洗脸时水拍在脸上软绵绵的，皮肤更顺滑。</div>
                    <div class="c-prop">大多软水机的工作原理是采用食品级的树脂交换再生技术，通过盐与树脂中的钙镁离子进行交换，从而达到除水垢的目的。当树脂吸附水中的硬度的离子随着时间的积累达到一个饱和的状态，将失去功效，这时候需要做的不是更换树脂，而是添加再生材料软水盐。树脂是有可再生功能的，软水机树脂使用寿命普遍很高。只需要添加再生材料软水盐，软水盐会置换树脂内的硬度离子，使得树脂恢复功效正常工作。使用软水机时要注意定期维护添加专用盐（非食用盐），用盐量则与当地的原水硬度、家庭用水量有关，一般三口之家一个月需要10kg盐。</div>
                    <div class="c-prop">净水机和纯水机的功能有所不同，两者互补，为保障生活用水和饮用水的安全品质，建议可同时选购。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con mt30">
                    <ul class="c-name-link">
                        <li><router-link to="/solution/3">查看水处理解决方案</router-link></li>
                        <li><router-link to="/quotation">1分钟快速报价</router-link></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 4">
            <div class="c-col-l">
                <div class="c-sidebar">
                    <div class="hd">热水课堂</div>
                    <ul class="bd">
                        <li :class="{active: tabIndex == 1}" @click="changeTab(1)">热水器，选电还是选燃气的好？</li>
                    </ul>
                </div>
            </div>
            <div class="c-col-r">
                <div class="c-con" v-if="tabIndex == 1">
                    <div class="c-tit">热水器，选电还是选燃气的好？</div>
                    <div class="c-prop">在大城市，对于选太阳能根本不现实，而空气能体积庞大，前期投入比较高，所以燃气热水器和电热水器理所当然的成为大家的首选，那么究竟选哪种好呢？</div>
                    <div class="c-names"><span>一、先来了解两种热水器的工作原理</span></div>
                    <div class="c-prop">燃气热水器</div>
                    <div class="c-prop">工作原理是：通过燃烧燃气来加热交换器，交换器将热能传给通过的水流，然后出来的即是热水，如下图</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-classroom-hotwater-1.jpg" /></div>
                    <div class="c-prop">这里需要注意：<br />1.热水的温度，受水流速度、水压大小、燃气流量等控制，所以恒定的水温会有一个±0.5℃的波动，那如果老式的燃气热水器可能无法做到恒温；<br />2.热交换器的材质有无氧铜制，还有铝合金的，一般情况下无氧铜制的价格要高于铝合金；</div>
                    <div class="c-prop">电热水器</div>
                    <div class="c-prop">工作原理是：通过加热电热棒来加热储水箱的水，如下图；</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-classroom-hotwater-2.jpg" /></div>
                    <div class="c-prop">这里来说一下电热水器需要注意的问题：<br />1. 储水箱的内胆材质，一般为搪瓷、晶硅或者钛金等，其中搪瓷材料不生锈也无水垢，效果最佳；<br />2.根据家庭人数来选择储水箱的大小，一个按40-50L水计算，多加一个人就多加20-30L;<br />3. 要定期的对热水器进行排污处理，比较电热棒加热会产生水垢，铁锈等杂质，若杂质不清除干净，会影响使用效果及使用寿命；</div>
                    <div class="c-names"><span>二、看看两种热水器的优缺点</span></div>
                    <div class="c-prop">燃气热水器</div>
                    <div class="c-prop">1.优点<br />基本上属于即开即热，无需等候，且可以多人连续使用；<br />因为不需要很大的储物箱，所以体积小，占用空间也较小；<br />加热成本较低；</div>
                    <div class="c-prop">2.缺点<br />可能会出现忽冷忽热的情况，也可能会热的时候超热，冷的时候水是冰的；<br />排空时间长，前面需放置一大段的凉水，所以有点浪费水，哪怕是7秒钟，尤其是冬天脱了衣服等热水的感觉不太爽；<br />如果安置不当，容易发生危险，所以需要独立的烟管道，其次是还要保持通风；</div>
                    <div class="c-prop">电热水器</div>
                    <div class="c-prop">1.优点<br />• 温度恒定，不会出现忽冷忽热的情况；<br />• 使用方便，有些热水器还可以用手机APP来远程控制开关机；<br />• 安全，自带有防触电装置，而且很多品牌的热水器是一开花洒会自动断电，关了花洒之后又会接上电源；</div>
                    <div class="c-prop">2.缺点<br />• 加热成本高，比燃气热水器贵30%左右；<br />• 体积大，很占用空间，不适合安装在小户型卫生间；<br />• 人数多时，洗完之后，中间需要等待把水加热；<br />• 容易结水垢，产生其他杂质，需要定期清理；</div>
                    <div class="c-prop">电热水器简单可靠，但使用成本高，且对比较占用空间；<br />而燃气热水器则体积较小、使用成本低，但对安装条件要求较高，使用时也会有冷水等待期，如果小区有统一的燃气管道，大家不妨选择燃气热水器，如果没有，且人数较少的家庭也可选择电热水器；<br />从成本跟节省考虑出发的话，选择燃气热水器更合适。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con mt30">
                    <ul class="c-name-link">
                        <li><router-link to="/solution/4">查看热水解决方案</router-link></li>
                        <li><router-link to="/quotation">1分钟快速报价</router-link></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 5">
            <div class="c-col-l">
                <div class="c-sidebar">
                    <div class="hd">厨房课堂</div>
                    <ul class="bd">
                        <li :class="{active: tabIndex == 1}" @click="changeTab(1)">手把手教你选橱柜</li>
                        <li :class="{active: tabIndex == 2}" @click="changeTab(2)">厨房装修小知识</li>
                    </ul>
                </div>
            </div>
            <div class="c-col-r">
                <div class="c-con" v-if="tabIndex == 1">
                    <div class="c-tit">手把手教你选厨柜材质</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-classroom-kitchen-1.jpg" /></div>
                    <div class="c-names"><span>实木颗粒板的优点</span></div>
                    <div class="c-prop">(1)由于它的内部结构是交叉错落的颗粒状，因此它的握钉力比较好，像圆钉或螺丝钉都是可以钉在上面的。</div>
                    <div class="c-prop">(2)它的密度较高，木质纤维颗粒也较大，因此内部天然木材含量高，它的环保性好，胶粘剂含量一般低于5%。</div>
                    <div class="c-prop">(3)它的稳定性好，不容易变形弯曲，强度硬度高，即使是我们挂上厚重的衣物，板材也不容易被压弯。</div>
                    <div class="c-prop">(4)与实木板相比，它的价格较便宜，并且保养起来也比较方便容易。而与其他板材相比，它的硬度又更高，质量也更好。</div>
                    <div class="c-prop">(5)实木颗粒板表面光滑平整，不会出现虫眼、节子等缺陷，同时还具有隔音、防霉、保温、不开裂等优点，具有出色的物理学强度。</div>
                    <div class="c-prop">实木颗粒板如何选购：</div>
                    <div class="c-prop">1.看切面</div>
                    <div class="c-prop">我们在选购实木颗粒板时可以先看下板材的切面，通常质量出色的实木颗粒板切面都比较平整，结构紧密均匀，不会出现凹凸不平的现象，因此我们可以从切面上来选购实木颗粒板。</div>
                    <div class="c-prop">2.看色泽</div>
                    <div class="c-prop">通常品牌较好的实木颗粒板表面色泽均匀且多为原木本色，不会出现色彩，因此我们在选购时，也可从色泽判断颗粒板的好坏。</div>
                    <div class="c-prop">3.看封边</div>
                    <div class="c-prop">封边条的好坏会直接影响板材的防潮性能及环保性能。封边不好会导致板材易受潮，而且板材内的甲醛也会从封边的地方泄露。</div>
                    <div class="c-names"><span>膜压板的优点</span></div>
                    <div class="c-prop">花样花色多，色彩丰富，木纹逼真，基本上可以满足不同客户对色彩的要求，膜压板抗划耐磨，耐热、耐污、防褪色，不开裂不变形，而且日常维护简单，不开裂不变形。</div>
                    <div class="c-prop">如何选购膜压板：</div>
                    <div class="c-prop">1. 膜压板在选购时主要根据自己喜欢的风格选择合适的门型及膜皮颜色即可；</div>
                    <div class="c-prop">2. 膜压板的优劣与膜皮关联较大，好的膜皮不易出现开裂及起泡现象，挑选膜皮时可以根据膜皮的手感及厚度判断膜皮优劣，好的膜皮触手细腻厚实，差的膜皮则手感粗糙较薄。</div>
                    <div class="c-names"><span>烤漆板的选购方法</span></div>
                    <div class="c-prop">烤漆板如何选购：</div>
                    <div class="c-prop">1、烤漆板的好坏首先要看工艺。真正的烤漆门板是一定要通过油漆多次喷涂然后烤制而成的，所以漆膜会比较牢固，而有些厂家的烤漆板可能并不是真正意义上的烤漆，只是喷涂了了亮光漆，时间久了可能会成片剥落或者出现发黄变色的现象。</div>
                    <div class="c-prop">2、其次烤漆板的好坏也要看它使用的是什么样的漆，这个大家在选购时可以向导购人员咨询。</div>
                    <div class="c-prop">3、另外，如果门店有对烤漆门板做破坏性试验的话，比如在门板上用刀划一道深深的痕迹，大家可以试一下用手去扣一下划痕，如果漆膜成片剥落，这个烤漆工艺肯定不行，如果是好的烤漆，用手去扣划痕应该只能扣下来一点油漆粉末。</div>
                    <div class="c-names"><span>实木板的选购方法</span></div>
                    <div class="c-prop">提到实木门板，大家的理解肯定是觉得整块门板都是实木的才叫实木门板，其实这是一个误区。目前市面上大的厨柜品牌几乎都很少推出全实木的实木门板，实木门扇门框一般为实木，门芯为了保证不开裂、不变形，采用中密度板贴实木皮，实木门板采用这种工艺而不使用整体实木，恰恰是为了保证质量，木材本身含有一定水分，如果用整体实木做成门板，时间长了难免会出现变形。</div>
                    <div class="c-prop">实木板如何选购：</div>
                    <div class="c-prop">1、看木材种类：橡胶木、松木这一类的速生木材价格比较低</div>
                    <div class="c-prop">2、看木材树龄：树龄越长木材质量越好，价格也越高</div>
                    <div class="c-prop">3、看木材产地：加拿大的枫木，美国的樱桃木，巴西的花梨木，美国红橡......不同产地的木材由于生长环境及气候的原因，质地及价格也会有不同</div>
                    <div class="c-prop">看油漆工艺：一般来说实木的油漆工艺有开放漆、封闭漆、半开放漆。目前行业内一般都会使用环保水性漆，开放漆的工艺较封闭漆要复杂七倍以上。（开放漆工艺可以看到并摸到实木的纹理，封闭漆则既看不到也摸不到实木纹理，半开放漆介于两者之间，能看到实木部分纹理但摸不到木纹）</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con" v-if="tabIndex == 2">
                    <div class="c-tit">厨房装修小知识</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-classroom-kitchen-2.jpg" /></div>
                    <div class="c-prop">厨房装修在家居装修中占有举足轻重的地位，有一句话说的是：装修好不好，厨房是代表。可见厨房装修的重要性。接下来小编就给大家来讲讲厨房装修的一些小知识。</div>
                    <div class="c-prop">柜体设计因人而异，首先是吊柜的高度以及吊架的挂设高度，甚至厨房中悬挂物的尺寸都要好好计算一下，根据家人的身高来设计，避免个子高大的一不小心撞上头，同时吊柜的深度设计得比工作台窄。</div>
                    <div class="c-prop">抽油烟机的高度也不能忽略，一定要以使用者身高为基准，最好比头部略高一点，否则“头破血流”不可避免，一般来说抽油烟机与灶台的距离不宜超过80厘米。灶台最好设计在台面的中央，保证灶台旁边预留有工作台面，以便炒菜时可以安全及时地放置从炉上取下的锅或汤煲，避免烫伤。</div>
                    <div class="c-prop">厨房的台面、橱柜的边角或是把手，有时为了造型的好看往往设计得很尖，虽说外形很酷，但很容易碰伤或划伤，所以最好用圆弧修饰橱柜及把手的边角位，可有效减少碰伤的可能。</div>
                    <div class="c-prop">电器设计有条不紊。厨房电器的增加，也使得厨房中的电器安全显得尤其重要起来。在处理内置式家电时，应预留边位，以便电器出现故障时修理易于移动。</div>
                    <div class="c-prop">挑选材料防水防火。厨房是个潮湿易积水的场所，所有表面装饰用材都应选择防水耐水性能优良的材料。地面、操作台面的材料应不漏水、不渗水。墙面、顶棚材料应耐水、可用水擦洗。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con mt30">
                    <ul class="c-name-link">
                        <li><router-link to="/solution/1">查看厨房解决方案</router-link></li>
                        <li><router-link to="/quotation">1分钟快速报价</router-link></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 6">
            <div class="c-col-l">
                <div class="c-sidebar">
                    <div class="hd">智能课堂</div>
                    <ul class="bd">
                        <li :class="{active: tabIndex == 1}" @click="changeTab(1)">国内外智能家居经典案例大盘点</li>
                    </ul>
                </div>
            </div>
            <div class="c-col-r">
                <div class="c-con" v-if="tabIndex == 1">
                    <div class="c-tit">国内外智能家居经典案例大盘点！</div>
                    <div class="c-prop">近年来随着物联网、云计算等大数据时代的飞速发展，智能家居也迎来了自己的春天。那么，随着智能家居应用的不断普及，有哪些经典案例是值得我们一看的呢？</div>
                    <div class="c-prop text-center"><img src="../../assets/img/pic-classroom-intell-1.jpg" /></div>
                    <div class="c-names"><span>美国比尔盖茨的家：智能家居的大集成者</span></div>
                    <div class="c-prop">盖茨的智能家居被称作“未来之屋”的豪宅，堪称当今智能家居的经典之作。这是他花费巨资、耗费数年精心打造的，豪宅的大门设有气象情况感知器，电脑可根据各项气象指标，控制室内的温度和通风情况。来到盖茨家的客人们都别着一只小电子针，里面装有内置电脑，可以随时显示他们所处的位置，所有的照明、音乐、温度、湿度等等都可以根据客人的需要，通过电脑任意调节。</div>
                    <div class="c-names"><span>澳大利亚让房屋：百分百自动化</span></div>
                    <div class="c-prop">澳大利亚智能家居的特点是让房屋做到百分之百的自动化，而且不会看到任何手动的开关。如一个用于推门的按钮，在内部装上一个模拟手指来自动激活;泳池与浴室的供水系统相通，自动加水或者排水。</div>
                    <div class="c-prop">同时安全问题也是考验智能家居的标准之一，澳大利亚智能家居保安系统里的传感器数量更多，所以即使飞过一只小虫，系统都可以探测出来。</div>
                    <div class="c-names"><span>韩国智能家居：随时随地享受服务</span></div>
                    <div class="c-prop">韩国电信用4A描述他们的数字化家庭系统(HDS)的特征，即：AnyDevice, AnyService, AnyWhere, AnyTime,以此表示这套系统能让主人在任何时间、任何地点操作家里的任何用具、获得任何服务。</div>
                    <div class="c-prop">比如客厅里，录像设备可以按照要求将电视节目录制到硬盘上，电视机、个人电脑、PAD都会有电视节目指南，预先录制好的节目可在电视、个人电脑和PAD上随时播放欣赏;厨房里，始终处于开启状态并联网的电冰箱成了其他智能家电的控制中心，冰箱可以提供美味食谱，也可上网、看电视;卧室内设有家庭保健检查系统，可以监控病人的脉搏、体温、呼吸频率和各种症状，以便医生提供及时的保健服务，通过与卧室的电视机相连，病人则可以向医生“面对面”咨询。</div>
                    <div class="c-names"><span>西班牙数字家居：充满艺术气息</span></div>
                    <div class="c-prop">西班牙是一个艺术氛围浓厚的国家，住宅楼的外观大多是典型的欧洲传统风格。但当你走进它的时候，才会发现智能化家居的设计的确与众不同。</div>
                    <div class="c-prop">室内自然光充足的时候，带有感应功能的日光灯会自动熄灭，减少能源消耗;安放在屋顶上的天气感应器能够随时得到气候、温度的数据，在下雨的时候它会自动关闭草地洒水喷头、关闭水池;而当太阳光很强的时候，它会自动张开房间和院子里的遮阳篷。地板上不均匀分布着的黑孔是自动除尘器，只需要轻松遥控，它们就会在瞬间清除地板上的所有灰尘、垃圾……，这一切都充满了柔和的艺术气息。</div>
                    <div class="c-names"><span>日本智能家居：室内室外全智能</span></div>
                    <div class="c-prop">日本也是一个智能化家居比较发达的国家，除了实现室内的家用电器自动化联网之外，还通过生物认证实现了自动门识别系统，站在安装于入口处的摄像机前，用大约1秒钟的时间，如果确认来人为公寓居民，大门就会打开。即使双手提着东西，也能打开大门。</div>
                    <div class="c-prop">日本的智能化家居还在厕所的便器垫圈上安装有血压计，当人坐在便器上时血压计便能检测其血压。而安装在便器内的血糖检测装置，能自行截流尿样并测出血糖值。此外，厕所内洗手池前的体重仪，可在人洗手的同时测量体重。检测结果均能出现在一个显示器上，全家人的检测值都可被分别保存。</div>
                    <div class="c-prop">但是，相比之下国内智能化家居由于起步相对较晚，所以能称得上大作的智能化住宅大多以国外成熟产品为主。但也不用悲观，智能家居离我们已经很近了，比如众华舒适家目前已经实现了部分智能控制，通过打通各配套产品通讯协议，实现全套中央系统智能联控，集成控制面板（手机APP＋线控面板），双屏集成控制代替空调、新风、暖通单独线控面板；简化场景式操作（会客、聚会、休息、离家模式），一键控制全屋温度、湿度、洁净度、风速。可以联系我们了解更多哦。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con mt30">
                    <ul class="c-name-link">
                        <li><router-link to="/solution/5">查看智能解决方案</router-link></li>
                        <li><router-link to="/quotation">1分钟快速报价</router-link></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            navIndex: 1,
            tabIndex: 1
        }
    },
    mounted () {
        let query = this.$route.query;

        if (query.tab && query.tab != '') {
            switch (query.tab) {
                case '1':
                    this.navIndex = 1;
                    break;

                case '2':
                    this.navIndex = 2;
                    break;

                case '3':
                    this.navIndex = 3;
                    break;

                case '4':
                    this.navIndex = 4;
                    break;

                case '5':
                    this.navIndex = 5;
                    break;

                case '6':
                    this.navIndex = 6;
                    break;

                default:
                    this.navIndex = 1;
            }
        }

        if (query.article && query.article != '') {
            switch (query.article) {
                case '1':
                    this.tabIndex = 1;
                    break;

                case '2':
                    this.tabIndex = 2;
                    break;

                case '3':
                    this.tabIndex = 3;
                    break;

                default:
                    this.tabIndex = 1;
            }
        }
    },
    methods: {
        changeNav (index) {
            this.navIndex = index;
            this.tabIndex = 1;
        },
        changeTab (index) {
            this.tabIndex = index;
        }
    }

}
</script>

<style lang="scss" scoped>
.class-room {
    padding: 165px 0 0;

    .c-nav {
        margin: 0 auto;
        padding: 0 65px;
        width: 1200px;
        height: 80px;

        &:after {
            height: 0;
            content: " ";
            clear: both;
            display: block;
        }

        li {
            margin-right: 10px;
            padding-left: 40px;
            width: 170px;
            height: 80px;
            line-height: 80px;
            cursor: pointer;
            background-repeat: no-repeat;
            background-position: 9px center;
            color: #fff;
            font-size: 20px;
            float: left;

            &.c-nav-1 {
                background-color: #90C421;
                background-image: url(../../assets/img/icon-temperature.png);
                background-size: 18px 39px;
            }

            &.c-nav-2 {
                background-color: #01AFEB;
                background-image: url(../../assets/img/icon-air.png);
                background-size: 24px 24px;
            }

            &.c-nav-3 {
                background-color: #FCD202;
                background-image: url(../../assets/img/icon-water.png);
                background-size: 18px 31px;
            }

            &.c-nav-4 {
                background-color: #1A2950;
                background-image: url(../../assets/img/icon-hotwater.png);
                background-size: 18px 25px;
            }

            &.c-nav-5 {
                background-color: #499A2A;
                background-image: url(../../assets/img/icon-kitchen.png);
                background-size: 24px 24px;
            }

            &.c-nav-6 {
                background-color: #F06945;
                background-image: url(../../assets/img/icon-lamp.png);
                background-size: 24px 24px;
            }

            &:last-child {
                margin-right: 0;
            }
        }
    }

    .c-container {
        margin: 0 auto;
        padding: 60px 0 50px;
        width: 1080px;
        -webkit-display: flex;
        -moz-display: flex;
        -ms-display: flex;
        display: flex;
        -webkit-justify-content: space-between;
        -moz-justify-content: space-between;
        -ms-justify-content: space-between;
        justify-content: space-between;
        color: #3F3F40;

        .c-col-l {
            width: 260px;
        }

        .c-col-r {
            width: 800px;
        }

        .c-sidebar {
            padding: 0 30px;
            width: 260px;
            background: #fff;
            box-shadow:0 2px 4px 0 rgba(0,0,0,0.5);
            border-radius:4px;

            .hd {
                line-height: 68px;
                border-bottom: 1px solid #EFEAEA;
                color: #3F3F40;
                font-size: 20px;
                text-align: center;
            }

            .bd {
                padding: 10px 0 30px;;

                li {
                    padding: 5px 0;
                    line-height: 22px;
                    text-align: center;
                    font-size: 16px;
                    color: #3F3F40;
                    cursor: pointer;

                    &.active, &:hover {
                        color: #0780ED;
                    }
                }
            }
        }

        .c-con {
            padding: 0 50px;
            background: #fff;
            box-shadow:0 2px 4px 0 rgba(0,0,0,0.5);
            border-radius: 4px;

            .c-tit {
                height: 62px;
                line-height: 62px;
                position: relative;
                font-size: 20px;
                color: #3F3F40;
                text-align: center;
                font-weight: 100;

                &:after {
                    width: 30px;
                    height: 6px;
                    background: #0780ED;
                    content: " ";
                    position: absolute;
                    bottom: 0;
                    left:50%;
                    margin-left: -15px;
                }
            }

            .c-names {
                padding: 30px 0 10px;
                text-align: center;

                span {
                    padding: 0 10px;
                    line-height: 39px;
                    background: #C5F2FF;
                    display: inline-block;
                    font-size: 16px;
                }
            }

            .c-prop {
                padding: 10px 0;
                font-size: 14px;
                line-height: 24px;
            }

            .c-name-link {
                padding: 25px 0;
                line-height:22px;
                text-align: center;

                &:after {
                    height: 0;
                    content: " ";
                    clear: both;
                    display: block;
                }

                li {
                    width: 50%;
                    height: 50px;
                    line-height: 50px;
                    border-right: 1px solid #EFEAEA;
                    float: left;

                    &:last-child {
                        border-right: 0;
                    }
                }

                a {
                    padding-right: 20px;
                    line-height: 22px;
                    display: inline-block;
                    background: url(../../assets/img/icon-right.png) no-repeat right center;
                    color: #0780ED;
                    font-size: 16px;

                    &:hover {
                        color: #0780ED;
                        text-decoration: underline;
                    }
                }
            }
        }
    }
}
</style>
