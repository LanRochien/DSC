import Mock from 'mockjs'
const login =Mock.mock('http://localhost:8080/test/?username=qwe&password=qwe ','post',function (req){

    return body
})
const testData=Mock.mock('http://localhost:8080/test','get',
{
    "resp": {
    "msg": "200",
        "status": 59
},
    "user": {
    "role": 4,
        "name": "科头程度",
        "id": 56,
        "password": "consectetur",
        "sex": "男",
        "record_date": "2014-05-13",
        "birthday": "2020-12-13",
        "location": "ea",
        "post_num": 62,
        "reply_num": 4,
        "head_image": "http://dummyimage.com/400x400"

}

})
const post =Mock.mock('http://localhost:8080/posttest','get',{
    "post": {
        "id": 61,
        "title": "完路和接织形",
        "post_image": "http://dummyimage.com/400x400",
        "content": "minim",
        "datetime": "1990-12-07 18:35:58",
        "click_qty": 20,
        "reply_qty": 11,
        "user": {
            "role": 27,
            "name": "题影每民走常",
            "id": 76,
            "password": "est",
            "sex": "女",
            "record_date": "1972-03-15",
            "birthday": "2018-02-07",
            "location": "qui labore do",
            "post_num": 66,
            "reply_num": 25,
            "head_image": "http://dummyimage.com/400x400"
        }
    },
    "comments": [
        {
            "id": 19,
            "content": "in fugiat adipisicing dolor irure",
            "datetime": "1992-11-01 23:53:45",
            "up_qty": 5,
            "user": {
                "role": 91,
                "name": "议而知先从西",
                "id": 54,
                "password": "ut Excepteur qui incididunt in",
                "sex": "女",
                "record_date": "1997-01-23",
                "birthday": "2005-02-05",
                "location": "dolor ut magna Lorem tempor",
                "post_num": 65,
                "reply_num": 45,
                "head_image": "http://dummyimage.com/400x400"
            },
            "post": {
                "id": 2,
                "title": "斯种法己小上",
                "post_image": "http://dummyimage.com/400x400",
                "content": "eiusmod Ut in",
                "datetime": "1992-05-10 21:21:17",
                "click_qty": 21,
                "reply_qty": 21,
                "user": {
                    "role": 86,
                    "name": "划易温重相发",
                    "id": 98,
                    "password": "consequat proident exercitation",
                    "sex": "男",
                    "record_date": "1994-03-29",
                    "birthday": "1972-08-18",
                    "location": "sint deserunt",
                    "post_num": 50,
                    "reply_num": 59,
                    "head_image": "http://dummyimage.com/400x400"
                }
            }
        },
        {
            "id": 22,
            "content": "dolor amet",
            "datetime": "2021-12-31 13:42:53",
            "up_qty": 38,
            "user": {
                "role": 22,
                "name": "法称少原从期",
                "id": 48,
                "password": "incididunt et ullamco",
                "sex": "女",
                "record_date": "1972-12-28",
                "birthday": "1996-10-29",
                "location": "dolore in Lorem cillum",
                "post_num": 66,
                "reply_num": 8,
                "head_image": "http://dummyimage.com/400x400"
            },
            "post": {
                "id": 49,
                "title": "马院按证知低",
                "post_image": "http://dummyimage.com/400x400",
                "content": "anim veniam occaecat enim labore",
                "datetime": "1982-10-02 07:20:59",
                "click_qty": 55,
                "reply_qty": 37,
                "user": {
                    "role": 32,
                    "name": "面总有实",
                    "id": 98,
                    "password": "fugiat ipsum aliquip nostrud",
                    "sex": "男",
                    "record_date": "2009-10-30",
                    "birthday": "2006-01-26",
                    "location": "laboris deserunt labore in sit",
                    "post_num": 65,
                    "reply_num": 30,
                    "head_image": "http://dummyimage.com/400x400"
                }
            }
        }
    ],
    "resp": {
        "msg": "aliquip pariatur",
        "status": 41
    }
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
        id: 123434,
        name: 'a24bsdfsc',
        explain: '242435',
        click_qty: 6685885,
        post_qty: 6755,
        plate_img: '/src/assets/test2.png',
    },
        {
            id: 1263334,
            name: 'a2zsdf 4bc',
            explain: '242435',
            click_qty: 6685885,
            post_qty: 6755,
            plate_img: '/src/assets/test2.png',
        },
        {
            id: 14,
            name: 'a24zxcfwebc',
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