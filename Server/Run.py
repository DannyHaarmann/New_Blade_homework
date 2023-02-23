from http.server import HTTPServer, BaseHTTPRequestHandler

Server = ['']

class helloHandler(BaseHTTPRequestHandler):
	def do_GET(self):
		if self.path.endswith('/Server'):
			self.send_response(200)
			self.send_header('content-type' , 'text/html')
			self.end_headers()
		

			output = ''
			output += '<html><body>'
		
			output += '<h1>Hello welcome to the most advanced web page</h1>'
			output += '<h3><a href="/Server/Signup"> Sign Up</a></h3>'
			output += '<h3><a href="/Server/Login"> Log In</a></h3>'
			for do in Server:
					output += do
					output += '</br>'
			output += '</body></html>'
			self.wfile.write(output.encode())


		if self.path.endswith('/Login'):
			self.send_response(200)
			self.send_header('content-type' , 'text/html')
			self.end_headers()
			
			output = ''
			output += '<html><body>'
			output += '<h1> Login </h1>'

			output += '<form method="POST" enctype="multipart/form-data" action="/Server/Login">'
			output += '<input name="task" type="text" placeholder="Email">'
			output += '</form>'

			output += '<form method="POST" enctype="multipart/form-data" action="/Server/Login">'
			output += '<input name="task" type="text" placeholder="Password">'
			output += '<input type="submit" value="submit">'
			output += '</form>'

			output += '</body></html>'

			self.wfile.write(output.encode())

		if self.path.endswith('/Signup'):
			self.send_response(200)
			self.send_header('content-type' , 'text/html')
			self.end_headers()

			output = ''
			output += '<html><body>'
			output += '<h1> Sign up Here </h1>'
			
			output += '<form method="POST" enctype="multipart/form-data" action="/Server/Signup">'
			output += '<input name="task" type="text" placeholder="First name">'
			output += '</form>'

			output += '<form method="POST" enctype="multipart/form-data" action="/Server/Signup">'
			output += '<input name="task" type="text" placeholder="last name">'
			output += '</form>'


			output += '<form method="POST" enctype="multipart/form-data" action="/Server/Signup">'
			output += '<input name="task" type="text" placeholder="Email">'
			output += '</form>'
				
			output += '<form method="POST" enctype="multipart/form-data" action="/Server/Signup">'
			output += '<input name="task" type="text" placeholder="Password">'
			output += '<input type="submit" value="submit">'
			output += '</form>'

			output += '</body></html>'

			self.wfile.write(output.encode())

def main():
		PORT = 8000
		sever = HTTPServer(('',PORT),helloHandler)
		print('up and running %s ' % PORT )
		sever.serve_forever()

if __name__ == '__main__':
	main()