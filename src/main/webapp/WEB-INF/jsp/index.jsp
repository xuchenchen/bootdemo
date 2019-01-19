<%--
  Created by IntelliJ IDEA.
  User: xucc
  Date: 2018/12/20
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringBoot</title>
    <script src="https://cdn.staticfile.org/react/16.4.0/umd/react.development.js"></script>
    <script src="https://cdn.staticfile.org/react-dom/16.4.0/umd/react-dom.development.js"></script>
    <script src="https://cdn.staticfile.org/babel-standalone/6.26.0/babel.min.js"></script>
</head>
<body>
    <div id="example"></div>
    <script type="text/babel">

        function ActionLink() {

            function handleClick(e) {
                e.preventDefault();
                console.log('链接点击');
            }

            return (
                <a href="#" onClick={handleClick}>点击</a>
            );
        }
        ReactDOM.render(<ActionLink/>,document.getElementById("example"));

        /*function FormattedDate(props) {
            return <h2>现在时间{props.date.toLocaleTimeString()}</h2>;
        }
        class Clock extends React.Component{
            constructor(props){
                super(props);
                this.state={date:new Date()};
            }
            componentDidMount(){
                this.timerID=setInterval(
                    ()=>this.tick(),1000
                );
            }
            componentWillUnmount(){
                clearInterval(this.timerID);
            }
            tick(){
                this.setState({date:new Date()});
            }
            render(){
                return (
                    <div>
                        <h1>Hello,world</h1>
                        <FormattedDate date={this.state.date}/>
                    </div>
                );
            }
        }
        function APPDIV(props) {
            return <div>
                <Clock/>
                <Clock/>
                <Clock/>
            </div>;

        }
        
        function App(props) {
            return <div>
                    <Clock />
                    <Clock />
                    <Clock />
                </div>
            ;
        }
        ReactDOM.render(<App/>,document.getElementById("example"));*/

        // function Name(props) {
        //     return <h1>网站名称:{props.name}</h1>;
        // }
        // ReactDOM.render(<Name name="瑞银信"/>,document.getElementById('example'));

        // function hellowMessage(props) {
        //     return <h1>H1数据</h1>;
        // }
        // const element=< hellowMessage/>
        // ReactDOM.render(element,document.getElementById('example'));

    //     function tick() {
    //         var i=1;
    //         const element=(
    //             <div>
    //                 <h1>{i == 1 ? 'True!' : 'False'}</h1>
    //                 <h2>element DIV</h2>
    //                 <h2>现在是{new Date().toLocaleTimeString()}</h2>
    //                 <h2>11111</h2>
    //             </div>)
    //         ReactDOM.render(element, document.getElementById("example"));
    //     }
    // setInterval(tick,1000)

    </script>
</body>
</html>
