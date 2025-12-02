<template>
<div>
<input type="file" @change="onFileChange" />
<button @click="upload">上传</button>
</div>
</template>
<script>
import axios from 'axios'
export default {
data(){return {file:null}},
methods:{
onFileChange(e){this.file=e.target.files[0]},
async upload(){
const fd=new FormData(); fd.append('file', this.file);
await axios.post('/api/docs/upload', fd, {headers:{'Content-Type':'multipart/form-data'}})
}
}
}
</script>