<template>
  <f7-page name="home">
    <!-- Top Navbar -->
    <f7-navbar>
      <f7-nav-title slot="nav-left">{{$f7.name}}</f7-nav-title>
    </f7-navbar>
    <f7-list tablet-inset>
      <f7-list-item >
        <f7-icon slot="media" f7="demo-list-icon"></f7-icon>
        <f7-block-title large style="margin: 0;">Examenes (backend - frontend)</f7-block-title>
      </f7-list-item>
    </f7-list>
    <f7-block>
      <f7-block>
        <f7-row>
          <f7-col>
            <f7-card class="demo-card-header-pic elevation-3 ">
              <f7-navbar>
                <f7-nav-title slot="nav-left">Examenen backend</f7-nav-title>
              </f7-navbar>              
              <f7-toolbar v-if="false">
                <f7-link @click="$refs.backendpdf.print()" link="#" text-color="white">Imprimir</f7-link>
              </f7-toolbar>              
              <f7-card-content>
                <pdf
                v-for="i in backend.numPages"
                :key="i"
                @click="$refs.backendpdf.print()"
                :src="backend.src"
                :page="i"
                style="display: inline-block; width: 50%"
                ></pdf>
              </f7-card-content>
              <f7-toolbar bg-color="green">
                <f7-link @click="$f7.redirectTo('/backend/')" link="#" text-color="white">Ver mas</f7-link>
              </f7-toolbar>
            </f7-card>          
          </f7-col>
          <f7-col>
            <f7-card class="demo-card-header-pic elevation-3 ">
              <f7-navbar>
                <f7-nav-title slot="nav-left">Examenen frontend</f7-nav-title>
              </f7-navbar>               
              <f7-toolbar v-if="false">
                <f7-link @click="$refs.frontendpdf.print()" link="#" text-color="white">Imprimir</f7-link>
              </f7-toolbar>              
              <f7-card-content>
                <pdf
                v-for="i in frontend.numPages"
                :key="i"
                @click="$refs.backendpdf.print()"
                :src="frontend.src"
                :page="i"
                style="display: inline-block; width: 50%"
                ></pdf>
              </f7-card-content>
              <f7-toolbar bg-color="green">
                <f7-link @click="$f7.redirectTo('/frontend/')" link="#" text-color="white">Ver mas</f7-link>
              </f7-toolbar>
            </f7-card>          
          </f7-col>
        </f7-row>
      </f7-block>
    </f7-block>
  </f7-page>
</template>
<script>
  import pdf from 'vue-pdf';
  var backendPdf = pdf.createLoadingTask('./static/pdf/Examen Tecnico.pdf');
  var frontendPdf = pdf.createLoadingTask('./static/pdf/Exámen front end.pdf');
  export default {
    data() {
      return {
        backend : {
          src: backendPdf,
          numPages: undefined
        },
        frontend : {
          src: frontendPdf,
          numPages: undefined
        }
      };
    },
    props:{

    },
    methods: {

    },    
    mounted() {
      this.$f7ready((f7) => {
        var self = this;
        // Init cordova APIs (see cordova-app.js)
        if (f7.device.cordova) {

        }
        // Call F7 APIs here

        // Set Dom7 style, events

        // load pages PDF

        self.backend.src.then(pdf => {
          self.backend.numPages = pdf.numPages;
        });        

        self.frontend.src.then(pdf => {
          self.frontend.numPages = pdf.numPages;
        });        

      }); 
    },
    computed: {
    },
    components: {
      pdf
    }    
  };
</script>