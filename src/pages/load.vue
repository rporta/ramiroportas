<template >
  <f7-page name="load" :style="'background-color: var(--f7-theme-color);'">
    <f7-preloader :size="size" :color="color" :style="'top : calc(50% - ' + (size / 2) + 'px);' + 'left : calc( 50% - ' + (size / 2) + 'px);'"></f7-preloader>
  </f7-page>
</template>
<style >
</style>
<script>
  import Dom7 from 'dom7';
  export default {
    data() {
      return {
        size: 80, 
        color: "white"
      };
    },
    methods:{

    },
    props:{

    },
    mounted() {
      this.$f7ready((f7) => {
        // Init cordova APIs (see cordova-app.js)
        if (f7.device.cordova) {

        }
        var self = this;

        setTimeout(function() {
          f7.redirectTo('/home/');
        }, 500);

      });
    }
  };
</script>