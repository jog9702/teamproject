package sec01.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FileDownload() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String file_repo = "C:\\download";
		String fileName = request.getParameter("fileName");
		System.out.println("fileName : " + fileName);
		OutputStream out = response.getOutputStream();
		
		String downFile = file_repo + "/" +fileName;
		File f = new File(downFile);
		
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition", "attachment; fileName="+fileName);
		
		FileInputStream in = new FileInputStream(f);
		while(true) {
			byte[] buffer = new byte[1024*8];
			int count = in.read(buffer);
			
			if(count == -1)
			{
				break;
				
			}
			out.write(buffer,0,count);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
