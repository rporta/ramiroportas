<template>
  <f7-app :params="f7params" >
    <!-- Status bar overlay for fullscreen mode-->
    <f7-statusbar></f7-statusbar>
    <!-- Your main view, should have "view-main" class -->
    <f7-view main class="safe-areas" :pushState="true" pushStateSeparator="#" url="/home/"></f7-view>
  </f7-app>
</template>
<script>
  import cordovaApp from '../js/cordova-app.js';
  import routes from '../js/routes.js';
  import config from '../config/config.json';
  export default {
    data() {
      return {
        // Framework7 Parameters
        f7params: {
          id: 'io.framework7.ramiroportas', // App bundle ID
          name: 'Ramiro Portas', // App name
          theme: 'auto', // Automatic theme detection
          // App root data
          data: function () {
            return {
              config: config
            };
          },

          // App routes
          routes: routes,

          // Register service worker
          serviceWorker: this.$device.cordova ? {} : {
            path: '/service-worker.js',
          },
          // Input settings
          input: {
            scrollIntoViewOnFocus: this.$device.cordova && !this.$device.electron,
            scrollIntoViewCentered: this.$device.cordova && !this.$device.electron,
          },
          // Cordova Statusbar settings
          statusbar: {
            overlay: this.$device.cordova && this.$device.ios || 'auto',
            iosOverlaysWebView: true,
            androidOverlaysWebView: false,
          },
        }
      }
    },
    methods: {

    },
    mounted() {
      this.$f7ready((f7) => {
        // Init cordova APIs (see cordova-app.js)
        if (f7.device.cordova) {
          cordovaApp.init(f7);
        }
        // Call F7 APIs here
        var self = this;
        // add method f7
        f7.redirectTo = (path) => {
          f7.view.main.router.navigate(path);
        };  

        // Set Dom7 style, events
        f7.$('body')[0].style.setProperty("--f7-theme-color", f7.data.config.theme.color.color);
        f7.$('body')[0].style.setProperty("--f7-theme-color-text", f7.data.config.theme.color.text.text);
        f7.$('body')[0].style.setProperty("--f7-theme-color-text-subtitle", f7.data.config.theme.color.text.subtitle);
        f7.$('body')[0].style.setProperty("--f7-theme-color-shade", f7.data.config.theme.color.shade);
        f7.$('body')[0].style.setProperty("--f7-theme-color-tint", f7.data.config.theme.color.tint);        
      });
    }
  }
</script>