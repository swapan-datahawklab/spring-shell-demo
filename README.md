```bash
items.find({
  "repo": "docker-repo",
  "name": "manifest.json",
  "path": {"$match": "*my-image*"}
}).sort({
  "$desc": ["created"]
}).limit(1)
```

```bash
curl -u {username}:{password} -X POST "https://artifactory.example.com/artifactory/api/search/aql" -H "Content-Type: text/plain" -d '
items.find({
  "repo": "docker-repo",
  "name": "manifest.json",
  "path": {"$match": "*my-image*"}
}).sort({
  "$desc": ["created"]
}).limit(1) '
```
