/** @type {import('next').NextConfig} */
const nextConfig = {
  images: {
      remotePatterns: [
        {
          protocol: 'https',
          hostname: 'pluspng.com',
          port: '',
          pathname: 'img-png/google-logo-png-open-2000.png',
        },
      ],
    },
};


export default nextConfig;
