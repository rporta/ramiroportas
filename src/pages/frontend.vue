<template>
  <f7-page name="Frontend">
    <f7-navbar title="Frontend" back-link="Back"></f7-navbar>
    <Grid 
    :items="photos.data"
    :draggable="true"
    :dragDelay="0"
    :popupDelay="100"
    :sortable="true"
    :cellWidth="150"
    :cellHeight="150"
    :center="true"  
    >
    <template slot="cell" slot-scope="props">
      <div :style="{
        backgroundImage: 'url(' + props.item.thumbnailUrl + ')',
        width: '150px',
        height: '150px',
        backgroundSize: 'cover'
      }"></div>
    </template>      
  </Grid>
</f7-page>
</template>
<script>
  // Import Grid Component
  import Grid from '../components/Grid.vue';

  export default {
    data() {
      return {
        API:{
          src: "https://jsonplaceholder.typicode.com/photos?albumId=1",
        },
        photos:{
          data : undefined
        },
        items:[]
      };
    },
    methods:{
      loadPhotos(self){
        self.$f7.request.get(self.API.src, e => {
          self.photos.data = this.orderPhotoData(e);        
        }, "json"); 
      },
      orderPhotoData(data){
        data.sort((a, b) => {
          var compare = a.title.length - b.title.length;
          if(compare == 0){
            compare = a.id - b.id;
          }
          return compare;
        });
        return data;
      }
    },
    mounted() {
      this.$f7ready((f7) => {
        // Init cordova APIs (see cordova-app.js)
        if (f7.device.cordova) {

        }
        this.loadPhotos(this);

      });
    },
    components: {
      Grid: Grid
    }    
  };
</script>