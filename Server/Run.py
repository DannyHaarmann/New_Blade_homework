from http.server import HTTPServer, BaseHTTPRequestHandler

class helloHandler(BaseHTTPRequestHandler):
	def do_GET(self):
		self.send_response(200)
		self.send_header('content-type' , 'text/html')
		self.end_headers()
		self.wfile.write('Hello' .encode()) 






def main():
		PORT = 8000
		sever = HTTPServer(('',PORT),helloHandler)
		print('up and running %s ' % PORT )
		sever.serve_forever()

if __name__ == '__main__':
	main()

