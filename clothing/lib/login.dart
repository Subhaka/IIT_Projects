import 'package:clothing/home.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(MyLogin());
}

class MyLogin extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Login(),
    );
  }
}

class Login extends StatelessWidget {
  final formKey = GlobalKey<FormState>();
  String userName;
  TextEditingController password = new TextEditingController();
  TextEditingController confirmpassword = new TextEditingController();

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
        home: Scaffold(
            body: SingleChildScrollView(
      child: Container(
          height: MediaQuery.of(context).size.height,
          decoration: BoxDecoration(
              image: DecorationImage(
                  image: AssetImage(
                    "assets/background.jpg",
                  ),
                  fit: BoxFit.fill)),
          child: Container(
              height: 180,
              width: MediaQuery.of(context).size.width,
              margin: EdgeInsets.symmetric(
                horizontal: 20,
                vertical: 20,
              ),
                  child: Form(
                key: formKey,
                child: Column(
                  children: <Widget>[
                    Padding(
                      padding: const EdgeInsets.only(top: 70),
                      child: Align(
                        alignment: Alignment.topLeft,
                        child: Text(
                          "Lookme",
                          style: TextStyle(fontSize: 34,fontWeight: FontWeight.bold,color: Colors.white,
                              fontStyle: FontStyle.italic),
                        ),
                      ),
                    ),
                    SizedBox(
                      height: 180,
                    ),
                    Container(
                      margin: EdgeInsets.only(bottom: 35),
                      padding: EdgeInsets.all(5),
                      decoration: BoxDecoration(
                        color: Colors.white60,
                        borderRadius: BorderRadius.circular(20),
                        border: Border.all(color: Color(0xFF000058), width: 2),
                      ),
                      child: Column(
                        children: <Widget>[
                          SizedBox(
                            height: 40,
                            child: Container(
                              child: TextFormField(
                                validator: (String value) {
                                  if (value.isEmpty) {
                                    return 'Please Enter Your Name';
                                  }
                                  Pattern pattern =
                                      r'^[A-Za-z0-9]+(?:[ _-][A-Za-z0-9]+)*$';
                                  RegExp regex = new RegExp(pattern);
                                  if (!regex.hasMatch(value))
                                    return 'Invalid username';
                                  else
                                    return null;
                                },
                                onSaved: (value) => userName,
                                autofocus: true,
                                decoration: InputDecoration(
                                    contentPadding: EdgeInsets.symmetric(
                                        vertical: 5, horizontal: 3),
                                    icon:
                                        Icon(Icons.person, color:Color(0xFF000058)),
                                    border: InputBorder.none,
                                    hintText: 'User Name',
                                    hintStyle: TextStyle(fontSize: 18,color: Colors.black)),
                              ),
                            ),
                          )
                        ],
                      ),
                    ),
                    Container(
                      margin: EdgeInsets.only(bottom: 35),
                      padding: EdgeInsets.all(5),
                      decoration: BoxDecoration(
                        color: Colors.white60,
                        borderRadius: BorderRadius.circular(20),
                        border: Border.all(color: Color(0xFF000058), width: 2),
                      ),
                      child: Column(
                        children: <Widget>[
                          SizedBox(
                            height: 40,
                            child: Container(
                              child: TextFormField(
                                controller: password,
                                keyboardType: TextInputType.text,
                                validator: (password_a) {
                                  if (password_a.isEmpty) {
                                    return 'Please Enter Password';
                                  }
                                  Pattern pattern =
                                      r'^(?=.*[0-9]+.*)(?=.*[a-zA-Z]+.*)[0-9a-zA-Z]{9,}$';
                                  RegExp regex = new RegExp(pattern);
                                  if (!regex.hasMatch(password_a))
                                    return 'Invalid password';
                                  else
                                    return null;
                                },
                                autofocus: true,
                                obscureText: true,
                                decoration: InputDecoration(
                                  contentPadding: EdgeInsets.symmetric(
                                      vertical: 5, horizontal: 3),
                                  icon: Icon(Icons.lock_outline,
                                      color: Color(0xFF000058)),
                                  border: InputBorder.none,
                                  hintText: 'Enter Password',
                                  hintStyle: TextStyle(fontSize: 18,color: Colors.black),
                                ),
                              ),
                            ),
                          )
                        ],
                      ),
                    ),
                    Container(
                      margin: EdgeInsets.only(bottom: 35),
                      padding: EdgeInsets.all(5),
                      decoration: BoxDecoration(
                        color: Colors.white60,
                        borderRadius: BorderRadius.circular(20),
                        border: Border.all(color: Color(0xFF000058), width: 2),
                      ),
                      child: Column(
                        children: <Widget>[
                          SizedBox(
                            height: 40,
                            child: Container(
                              child: TextFormField(
                                controller: confirmpassword,
                                keyboardType: TextInputType.text,
                                style: TextStyle(color: Colors.black),
                                obscureText: true,
                                validator: (String value) {
                                  if (value.isEmpty) {
                                    return 'Please Re-enter Password';
                                  }
                                  if (password.text != confirmpassword.text) {
                                    return "Password does not match";
                                  }
                                  return null;
                                },
                                autofocus: true,
                                decoration: InputDecoration(
                                    contentPadding: EdgeInsets.symmetric(
                                        vertical: 5, horizontal: 3),
                                    icon: Icon(Icons.lock, color: Color(0xFF000058)),
                                    border: InputBorder.none,
                                    hintText: 'Confirm Password',
                                    hintStyle: TextStyle(fontSize: 18,color: Colors.black)),
                              ),
                            ),
                          )
                        ],
                      ),
                    ),
                    Expanded(
                      child: SizedBox(
                        height: 58,
                        width: 320,
                        child: RaisedButton(
                            color: Color(0xFF000058),
                            shape: RoundedRectangleBorder(
                                borderRadius: BorderRadius.circular(19)),
                            child: Text(
                              "Login",
                              style: TextStyle(color: Colors.white, fontSize: 28),
                            ),
                            onPressed: () {
                              if (formKey.currentState.validate()) {
                                Navigator.push(context,
                                    MaterialPageRoute(builder: (context) {
                                  return Home();
                                }));
                              }

                              ;
                            }),
                      ),
                    )
                  ],
                ),
              )))),
    ));
  }
}
