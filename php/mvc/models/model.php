<?php

class EnlacesPaginas {
    
    public function enlacesPaginasModel($enlacesModel) {
        
        if($enlacesModel == "nosotros" ||
           $enlacesModel == "servicios" ||
           $enlacesModel == "contactenos") {
           
            $modules = "views/modules/".$enlacesModel.".php";
        
        } else {
            
            $modules = "views/modules/inicio.php";
        
        }
        
        return $modules;
        
    }
        
}

?>