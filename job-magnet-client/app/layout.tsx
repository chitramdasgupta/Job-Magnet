import type { Metadata } from "next";
import { Inter } from "next/font/google";
import "./globals.css";
import Link from "next/link";

const inter = Inter({ subsets: ["latin"] });

export const metadata: Metadata = {
  title: "Job Magnet",
  description: "An app to help you land your dream job!",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className={inter.className}>
        <nav>
          <ul>
            <li>
              <Link href="/">Job Magnet</Link>
            </li>
            <li>
              <Link href="/jobs">Jobs</Link>
            </li>
          </ul>
        </nav>
        {children}
      </body>
    </html>
  );
}
