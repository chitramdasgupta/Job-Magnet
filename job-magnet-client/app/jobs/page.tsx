import JobCard from "./components/JobCard";

export default function Home() {
  return (
    <main>
      <div className="flex flex-col items-center">
        <JobCard />
        <JobCard />
        <JobCard />
        <JobCard />
      </div>
    </main>
  );
}
