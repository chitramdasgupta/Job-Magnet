import Image from "next/image";

function JobCard() {
  return (
    <div className="border-2 py-4 mb-2 w-1/3 flex items-center gap-x-2 ms-2">
      <Image
        src="/debian_logo.png"
        alt="company logo"
        width={100}
        height={100}
      />
      <div>
        <h2 className="font-bold">Job Title</h2>
        <h3>Company Name</h3>
        <p>Location, Country</p>
        <p>Date posted</p>
      </div>
    </div>
  );
}

export default JobCard;
