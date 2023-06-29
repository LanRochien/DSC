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
