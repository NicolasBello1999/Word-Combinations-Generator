from flask import Flask, render_template

webApp = Flask(__name__)

@webApp.route("/")
def home():
    return render_template("home.html")

if __name__ == "__main__":
    try:
        webApp.run(debug=True)
    except Exception as e:
        print(f"An error occurred when trying to run the program. Error detected:\n{e}")