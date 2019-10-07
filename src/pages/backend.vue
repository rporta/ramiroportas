<template>
  <f7-page name="Backend">
    <f7-navbar title="Backend" back-link="Back"></f7-navbar>

    <!-- Ejercicio 1 -->
    <f7-list tablet-inset v-for="(e, i) in examen" :key="i">
      <f7-list-item >
        <f7-icon slot="media" f7="demo-list-icon"></f7-icon>
        <f7-block-title large style="margin: 0;">{{i.replace(/^[a-z]/, function (x) {return x.toUpperCase()})}}</f7-block-title>        
      </f7-list-item>
      <template v-for="(ej, ij) in e" >
        <f7-block strong inset bg-color="black" text-color="green">
          <f7-block-title text-color="white" style="margin: 0;">Resuelto en {{ej.lenguaje}}</f7-block-title>   
          <pre style="white-space: break-spaces;">{{ej.result}}</pre>
          <f7-button @click="descargar(ej.src)" fill>Descargar Archivo ({{ej.lenguaje}})</f7-button>
        </f7-block>
      </template>
    </f7-list>
    <!-- Ejercicio2 -->
    <f7-list tablet-inset>
      <f7-list-item >
        <f7-icon slot="media" f7="demo-list-icon"></f7-icon>
        <f7-block-title large style="margin: 0;">Ejercicio 2</f7-block-title>        
      </f7-list-item>
    </f7-list>
    <template v-for="(eJava, iJava) in java.ejercicio2" >
      <f7-block strong inset bg-color="black" text-color="green">
        <f7-block-title text-color="white" style="margin: 0;">Resuelto en {{eJava.lenguaje}}</f7-block-title>   
        <pre style="white-space: break-spaces;">{{eJava.result}}</pre>
        <f7-button @click="descargar(eJava.src)" fill>Descargar Archivo ({{eJava.lenguaje}})</f7-button>
      </f7-block>
    </template>   
    <!-- Ejercicio3 -->
    <f7-list tablet-inset>
      <f7-list-item >
        <f7-icon slot="media" f7="demo-list-icon"></f7-icon>
        <f7-block-title large style="margin: 0;">Ejercicio 3</f7-block-title>        
      </f7-list-item>
    </f7-list>
    <f7-row>
      <f7-col>
        <f7-block strong inset>
          <f7-card class="demo-card-header-pic elevation-3 ">
            <f7-navbar>
              <f7-nav-title slot="nav-left">Diagrama de clases UML</f7-nav-title>
            </f7-navbar>               
            <f7-toolbar v-if="false">
              <f7-link @click="$refs.frontendpdf.print()" link="#" text-color="white">Imprimir</f7-link>
            </f7-toolbar>              
            <f7-card-content>
              <pdf src="./static/pdf/Ejercicio3.pdf" style="display: inline-block; width: 100%; margin: auto;"></pdf>
            </f7-card-content>
            <f7-toolbar bg-color="green">
              <f7-link @click="descargar('./static/pdf/Ejercicio3.pdf')" link="#" text-color="white">Descargar</f7-link>
            </f7-toolbar>
          </f7-card> 
        </f7-block>        
      </f7-col>
      <f7-col>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <f7-block strong>
          <f7-block-title style="margin: 0;">Solución :</f7-block-title>
          <p>Propongo la siguiente solución al problema, definida en un diagrama de clases UML,</p>
          <p>compuesta por 4 clases :</p>
          <p>1. Pasaje</p>
          <p>2. Itinerario</p>
          <p>3. Conexión</p>
          <p>4. Transportador</p>
          <p>Dichas clases se encuentran relacionadas, para resolver operaciones</p>
          <p>como agregar, cambiar o eliminar conexiones al un itinerario, que tiene asignado el pasaje,</p>
          <p>como asignar, cambiar o eliminar el transportador que tiene asignada una determinada conexión.</p>
          <br>
          <p>El diagrama UML define las siguientes relaciones:</p>
          <p>La entidad Pasaje se compone de de un Itinerario, relación 1:1</p>
          <p>La entidad Itinerario se compone de muchas conexiones, relación 1:n</p>
          <p>La entidad Trasportador realiza el transporte de una sola conexión, relación 1:1</p>
        </f7-block>   
      </f7-col>
    </f7-row>    
  </f7-page>
</template>
<script>
  import pdf from 'vue-pdf';
  export default {
    data() {
      return {
        examen:{
          ejercicio1A:[
          {
            lenguaje: "Php", 
            result: undefined,
            src: "../static/examenes/backend/php/Ejercicio1/ejercicio1A.php"
          }, {
            lenguaje: "Javascript", 
            result: undefined,
            src: "../static/examenes/backend/javascript/Ejercicio1/ejercicio1A.js"
          }],
          ejercicio1B:[
          {
            lenguaje: "Php", 
            result: undefined,
            src: "../static/examenes/backend/php/Ejercicio1/ejercicio1B.php"
          }, {
            lenguaje: "Javascript", 
            result: undefined,
            src: "../static/examenes/backend/javascript/Ejercicio1/ejercicio1B.js"
          }]
        },
        java:{
          ejercicio2:[
          {
            lenguaje: "java", 
            result: undefined,
            src: "../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/Run.java"
          }, {
            lenguaje: "java", 
            result: undefined,
            src: "../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/CompaniaAerea.java"
          }, {
            lenguaje: "java", 
            result: undefined,
            src: "../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/Paquete.java"
          }, {
            lenguaje: "java", 
            result: undefined,
            src: "../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/Cliente.java"
          }]
        }
      };
    },
    methods:{
      loadExamples(self){
        // load example evaluations 
        self.$f7.request.get("../static/examenes/backend/php/Ejercicio1/ejercicio1A.php", e => {
          // cargando ejercicio 1A (php)
          self.examen.ejercicio1A[0].result = e;
        });
        self.$f7.request.get("../static/examenes/backend/php/Ejercicio1/ejercicio1B.php", e => {
          // cargando ejercicio 1B (php)
          self.examen.ejercicio1B[0].result = e;
        });        
        self.$f7.request.get("../static/examenes/backend/javascript/Ejercicio1/ejercicio1A.js", e => {
          // cargando ejercicio 1A (javascript)
          self.examen.ejercicio1A[1].result = e;
        });
        self.$f7.request.get("../static/examenes/backend/javascript/Ejercicio1/ejercicio1B.js", e => {
          // cargando ejercicio 1B (javascript)
          self.examen.ejercicio1B[1].result = e;
        });
        self.$f7.request.get("../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/Run.java", e => {
          // cargando ejercicio 2 (java)
          self.java.ejercicio2[0].result = e;
        });
        self.$f7.request.get("../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/CompaniaAerea.java", e => {
          // cargando ejercicio 2 (java)
          self.java.ejercicio2[1].result = e;
        });
        self.$f7.request.get("../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/Paquete.java", e => {
          // cargando ejercicio 2 (java)
          self.java.ejercicio2[2].result = e;
        });
        self.$f7.request.get("../static/examenes/backend/java/Ejercicio2/src/main/java/com/ramiroportas/ejercicio2/Cliente.java", e => {
          // cargando ejercicio 2 (java)
          self.java.ejercicio2[3].result = e;
        });
      },
      descargar(src){
        var self = this;        

        var archivo = (src => {
          src = src.split("/");
          return src[src.length - 1]
        })(src);
        src = src.replace("../", "");
        this.$f7.dialog.confirm(null, "Descargar " + archivo + " ?", data => {
          // ok 
          window.open(src);
        },
        data => {
          // cancel

        });
      }      
    },
    mounted() {
      this.$f7ready((f7) => {
        // Init cordova APIs (see cordova-app.js)
        if (f7.device.cordova) {
        }
        // load example evaluations 

        this.loadExamples(this);



      });
    },
    components: {
      pdf
    }    
  };
</script>