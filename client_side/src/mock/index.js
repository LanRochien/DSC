import Mock from 'mockjs'
const testData=Mock.mock('http://localhost:8080/test','get',{
    name:"Lanxxx",
    id:1

})
const plate=Mock.mock('http://localhost:8080/plate','get',{
    forum:[{
    id: 123,
    name: 'abc',
    explain: 'dfjskldfj',
    click_qty: 5885,
    post_qty: 655,
    plate_img: '/src/assets/test2.png',
},{
        id: 1234,
        name: 'a24bc',
        explain: '242435',
        click_qty: 6685885,
        post_qty: 6755,
        plate_img: '/src/assets/test2.png',
    },
        {
            id: 1234,
            name: 'a24bc',
            explain: '242435',
            click_qty: 6685885,
            post_qty: 6755,
            plate_img: '/src/assets/test2.png',
        },
        {
            id: 1234,
            name: 'a24bc',
            explain: '242435',
            click_qty: 6685885,
            post_qty: 6755,
            plate_img: '/src/assets/test2.png',
        },

]
    }
)
const plates=Mock.mock("http://localhost:8080/posts",'get',{

    plate_id: 23,
    plate_name: "决美导备办引",
    explain: "reprehenderit velit aute in sint",
    post_qty: 67,
    click_qty: 53,
    plate_image: "http://dummyimage.com/400x400",
    posts: [
    {
        post_id: 73,
        title: "海统形装格争得",
        post_image: "http://dummyimage.com/400x400",
        content: "ex",
        datetime: "1990-04-22 07:45:49",
        click_qty: 78,
        reply_qty: 44,
        role: 26,
        user:{
            id: 17,
            name: "劳时真",
        },
        password: "aliquip dolore",
        sex: "男",
        record_date: "1994-08-16",
        birthday: "1986-08-22",
        location: "officia aliqua",
        ban_tag: 20,
        post_num: "71",
        reply_num: "96",
        vol_tag: 88,
        head_image: "http://dummyimage.com/400x400"
    },
    {
        post_id: 94,
        title: "验入作只意和式",
        post_image: "http://dummyimage.com/400x400",
        content: "elit reprehenderit dolore",
        datetime: "1970-11-07 17:35:34",
        click_qty: 96,
        reply_qty: 90,
        role: 70,
        user:{
            id: 9,
            name: "研你建量办利",
        },
        password: "mollit",
        sex: "女",
        record_date: "1979-07-19",
        birthday: "2011-08-30",
        location: "pariatur mollit ipsum laborum id",
        ban_tag: 82,
        post_num: "60",
        reply_num: "15",
        vol_tag: 2,
        head_image: "http://dummyimage.com/400x400"
    },
    {
        post_id: 88,
        title: "天值数",
        post_image: "http://dummyimage.com/400x400",
        content: "officia consequat Excepteur anim",
        datetime: "1976-07-24 07:48:19",
        click_qty: 52,
        reply_qty: 72,
        role: 83,
        user:{
            id: 39,
            name: "同民团写心品矿",
        },
        password: "occaecat dolor nisi deserunt",
        sex: "女",
        record_date: "1985-09-24",
        birthday: "1991-10-07",
        location: "sint magna nisi culpa",
        ban_tag: 34,
        post_num: "99",
        reply_num: "19",
        vol_tag: 88,
        head_image: "http://dummyimage.com/400x400"
    }
]

})